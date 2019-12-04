package com.qf.controller;

import com.qf.cogfig.R;
import com.qf.pojo.User;
import com.qf.response.UserResponse;
import com.qf.service.UserService;
import com.qf.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UesrController {
    @Value("${qiniu.url}")
    private String url;
    @Autowired
    UploadUtils uploadUtils;
    @Autowired
    public UserService userService;
    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String MALL_SENDER;
    //测试发送简单的邮件
    @Autowired
    TemplateEngine templateEngine;
    //注册 邮箱
    @RequestMapping("/userinfo")
    @ResponseBody
    public User yong(HttpServletRequest request){
        HttpSession session = request.getSession();
       User userinfo = (User)session.getAttribute("userinfo");
        return userinfo;
    }
    @RequestMapping("/em")
    @ResponseBody
    public Boolean emc(@RequestBody() String email) throws MessagingException {
        if (email!=null){
            Context context = new Context();
            context.setVariable("id", "1");
            String emailTemplate = templateEngine.process("emailTemplate", context);
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(MALL_SENDER);
            mimeMessageHelper.setTo(email);//qq自动拦截，无法验证可行性
            mimeMessageHelper.setSubject("测试激活邮件");
            mimeMessageHelper.setText(emailTemplate, true);
            javaMailSender.send(mimeMessage);
            return true;
        }else{
            return false;
        }

    }
    //注册  用户新增
    @RequestMapping(value = "/ins",method = RequestMethod.POST)
    @ResponseBody
    public int insert(@RequestBody  User user){
        System.out.println(user);
        return userService.insert(user);
    }
   //登录验证
    @RequestMapping(value = "/log/{phone}/{pass}",method = RequestMethod.POST)
    @ResponseBody
    public int login(@PathVariable("phone")String phone,@PathVariable("pass")String pass){
        User login = userService.login(phone,pass);
        if (login!=null){
            //success
            /*HttpSession session = request.getSession();
            session.setAttribute("userinfo",login);*/
            return 1;
        }
        return 0;
    }
   //手机查头像
   @RequestMapping("/userpp")
   @ResponseBody
   public String userpp(@RequestBody String  phone){
       String findpp = userService.findpp(phone);
       return userService.findpp(findpp);
   }
  //用户资料查询
  @RequestMapping(value = "/ufindAll",method = RequestMethod.GET)
  @ResponseBody
  public List<User> ufindAll(){
      return userService.findAll();
  }
  //个人信息修改1
    @RequestMapping(value = "/uupdate1",method = RequestMethod.POST)
    @ResponseBody
    public User uupdate1(@RequestBody User user){
        int uid = user.getUid();
        return userService.findById(uid);
    }
  //个人信息修改2
    @RequestMapping(value = "/uupdate2",method = RequestMethod.POST)
    @ResponseBody
    public String userup(User user, @RequestParam("file")MultipartFile mull){
            try{
                String upload = uploadUtils.upload(mull);
                user.setPhoto(url+upload);
                userService.userupdate(user);
                return "redirect:/findAll";
            }catch (Exception e){
                return "404";
            }
    }
    //用户分页
    @RequestMapping("/findsp/{size}/{page}")
    @ResponseBody
    public UserResponse findsp(@PathVariable("size")Integer size, @PathVariable("page")Integer page){
      return userService.findsp(size,page);
    }
    //用户条件
    @ResponseBody
    @RequestMapping("/findTJ")
    public User findTJ(@RequestBody User user){
       /* String uname = user.getUname();
        uname="%"+uname+"%";
        user.setUname(uname);*/
        return userService.findTJ(user);
    }
    //用户id调用
    @RequestMapping(value = "/userfindOne",method = RequestMethod.POST)
    @ResponseBody
    public User findOne(@RequestBody User user){
        int uid = user.getUid();
        return userService.findById(uid);
    }

    //用户新增
    @RequestMapping(value = "/userinsert",method = RequestMethod.POST)
    @ResponseBody
    public User userinsert(@RequestBody User user){
      return  userService.userinsert(user);
    }
    //用户删除
    @RequestMapping(value = "/userdelete",method = RequestMethod.POST)
    @ResponseBody
    public String userdelete(@RequestBody User user){
      return  userService.datele(user);
    }
}

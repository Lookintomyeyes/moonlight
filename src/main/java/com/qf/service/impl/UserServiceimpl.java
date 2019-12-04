package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.Eduexper;
import com.qf.pojo.User;
import com.qf.repository.EduexperRepository;
import com.qf.repository.UserRepository;
import com.qf.response.UserResponse;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    private UserDao userDao;
    @Autowired
    private  User user;
   /* @Resource
    private UserDao userDaor;*/
    @Autowired
    private EduexperRepository eduexperRepository;
    //注册 新增用户
    @Override
    public int insert(User user) {
        try {
            userRepository.saveAndFlush(user);
            return 1;
        }catch (Exception e){
            return 0;
        }

    }
    //登录 验证信息
   @Override
    public User login(String phone, String pass) {
        User lu = userRepository.findByPhone(phone);
        if (lu!=null){
            if (lu.getPass().equals(pass)){
                return lu;
            }
        }
        return null;
    }

    @Override
    public User userupdate(User user) {
       return userRepository.saveAndFlush(user);
    }

    @Override
    public String findpp(String photo) {
        User byPhone = userRepository.findByPhone(photo);
        if(byPhone.equals(user.getPhone())){
            return user.getPhoto();
        }
        return null;
    }

    @Override
    public User findById(Integer uid) {
        Optional<User> byId = userRepository.findById(uid);
        User user=null;
        if (byId.isPresent()){
            user=byId.get();
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User userinsert(User user) {
        return userRepository.save(user);
    }
    //用户删除
    @Override
    public String datele(User user) {
        try{
            userRepository.deleteById(user.getUid());
            return "success";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "fail";
    }

    @Override
    public UserResponse findsp(Integer size, Integer page) {
            if(page<0){
                page=0;
            }else {
                page=page-1;
            }
        Pageable pages=PageRequest.of(page,size);
        Page<User> all=userRepository.findAll(pages);
        List<User> content=all.getContent();
        UserResponse userResponse = new UserResponse();
        userResponse.setList(content);
        userResponse.setTotal(all.getTotalElements());
        userResponse.setPage(all.getTotalPages());
        return userResponse;
    }

    @Override
    public User findTJ(User user) {
        return userDao.findTJ(user);
    }

    @Override
    public List<Eduexper> EfindAll() {
        return eduexperRepository.findAll();
    }

    @Override
    public Eduexper Eupdate(Eduexper eduexper) {
        return eduexperRepository.saveAndFlush(eduexper);
    }

    @Override
    public Eduexper findOne(Integer id) {
        Optional<Eduexper> byId = eduexperRepository.findById(id);
        Eduexper eduexper=null;
        if(byId.isPresent())
            eduexper=byId.get();
        return eduexper;
    }


}

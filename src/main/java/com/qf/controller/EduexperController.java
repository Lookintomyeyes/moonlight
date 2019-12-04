package com.qf.controller;

import com.qf.pojo.Eduexper;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EduexperController {
    @Autowired
    private UserService userService;
    //简历信息  查询
    @RequestMapping(value = "/efind",method = RequestMethod.GET)
    public List<Eduexper> efindAll(){
        return userService.EfindAll();
    }
    //修改
    @RequestMapping(value = "/eupdate1",method = RequestMethod.POST)
    public Eduexper eupdate1(Eduexper eduexper){
        int id = eduexper.getId();
        return userService.findOne(id);
    }
    @RequestMapping(value = "/eupdate2",method = RequestMethod.POST)
    public String eupdate2(@RequestBody() Eduexper eduexper){
        userService.Eupdate(eduexper);
        return "redirect:/efind";
    }
}

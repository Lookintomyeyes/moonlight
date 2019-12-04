package com.qf.controller;

import com.qf.pojo.Worstu;
import com.qf.service.WorstuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorstuController {
    @Autowired
    public WorstuService worstuService;
    @RequestMapping(value = "/findLy",method = RequestMethod.POST)
    public Worstu findLy(@RequestBody Worstu worstu){
        Integer id = worstu.getId();
        return worstuService.findLy(id);
    }

}

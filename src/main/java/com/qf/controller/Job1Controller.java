package com.qf.controller;

import com.qf.pojo.Job1;
import com.qf.service.Job1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by HP        PC on 2019/12/4.
 */
@RestController
public class Job1Controller {
    @Autowired
    private Job1Service job1Service;
    //全部兼职全部查询
    @RequestMapping("/findAll")
    public List<Job1> finfAll(){
        return   job1Service.findAll();
    }
    //全部兼职模糊查询
    @RequestMapping( value = "/findbylike",method = RequestMethod.POST)
    public List<Job1> findbylike(@RequestBody Job1 job1){
        String jname = job1.getJname();
        jname="%"+jname+"%";
        job1.setJname(jname);
        String district = job1.getDistrict();
        district="%"+district+"%";
        job1.setDistrict(district);

        return job1Service.findbylike(job1);

    }

    //删除
    @RequestMapping( value = "/delbyid",method = RequestMethod.POST)
    public String delbyid(@RequestBody  Job1 job){

        return  job1Service .delbyid(job);
    }

    //有id是修改，没有id是增加
    @RequestMapping("/add")
    public Job1 addone(@RequestBody  Job1 job1){

        return  job1Service.saveAndFlush(job1);
    }



}


package com.qf.controller;

import com.qf.pojo.Catalog1;
import com.qf.service.Catalog1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by HP        PC on 2019/12/4.
 */
@RestController
public class Catalog1Controller {
    @Autowired
    private Catalog1Service catalog1Service;
    //一级分类查询
    @RequestMapping("/findyiji")
    public  List<Catalog1>  fingAll(){
        return   catalog1Service.findAll();

    }
    //一级分类增加或者修改
    @RequestMapping("/updateone")
    public Catalog1 addone(@RequestBody Catalog1 catalog1){

        return  catalog1Service.saveAndFlush(catalog1);
    }
    //删除
    @RequestMapping( value = "/deletebyid",method = RequestMethod.POST)
    public String delbyid(@RequestBody  Catalog1 catalog1){

        return  catalog1Service .delbyid(catalog1);
    }


}

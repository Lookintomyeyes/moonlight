package com.qf.service;

import com.qf.pojo.Eduexper;
import com.qf.pojo.User;

import java.util.List;

public interface UserService {
    //注册新增用户
    public int insert(User user);
    //登录验证
    public User login(String phone, String pass);
    //个人信息修改
    public User userupdate(User user);
    //手机号调头像
    public int findpp(float photo);
    //查询一个
    public User findById(Integer uid);
    //用户资料查询
    public  List<User> findAll();
    //用户资料新增
   /* public User userinsert(User user);
    //用户资料删除
    public String datele(User user);*/
    //查询教育经历
    public List<Eduexper> EfindAll();
    //教育信息修改
    public Eduexper Eupdate(Eduexper eduexper);
    //教育查询一个
    public Eduexper findOne(Integer id);
}

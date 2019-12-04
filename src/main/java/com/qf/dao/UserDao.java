package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User findByName(String pass);
    //手机号调头像
     int findpp(float photo);
     //条件查询
    public User findTJ(User user);
}

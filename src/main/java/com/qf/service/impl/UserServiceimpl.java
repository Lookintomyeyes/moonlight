package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.Eduexper;
import com.qf.pojo.User;
import com.qf.repository.EduexperRepository;
import com.qf.repository.UserRepository;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    public UserRepository userRepository;
   /* @Autowired
    private UserDao userDao;*/
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
    public int findpp(float photo) {
        return 0;
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

   /* @Override
    public User userinsert(User user) {
        return userRepository.findAll(user);
    }

    @Override
    public String datele(User user) {
        return userRepository.delete(user);
    }*/

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

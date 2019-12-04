package com.qf.service.impl;

import com.qf.dao.WorstuDao;
import com.qf.pojo.User;
import com.qf.pojo.Worstu;
import com.qf.service.WorstuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("worstuService")
public class WorstuServiceImpl implements WorstuService {
    @Autowired
    public WorstuDao worstuDao;
//用户查询兼职
    @Override
    public Worstu findLy(Integer id) {
        Worstu ly = worstuDao.findLy(id);
        return ly;
    }
}

package com.qf.service;

import com.qf.dao.WorstuDao;
import com.qf.pojo.Worstu;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface WorstuService {

    public Worstu findLy(Integer id);
}

package com.qf.service.impl;

import com.qf.dao.Job1Dao;
import com.qf.pojo.Job1;
import com.qf.repository.Job1Repository;
import com.qf.service.Job1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HP        PC on 2019/12/4.
 */
@Service
public class Job1Serviceimpl  implements Job1Service {
    @Autowired
    private Job1Repository job1Repository;
    @Autowired
    private Job1Dao job1Dao;
    @Override
    public List<Job1> findAll() {
        return  job1Repository.findAll();
    }
//
    @Override
    public List<Job1> findbylike(Job1 job1) {


        return  job1Dao.findbylike(job1) ;
    }
//删除
    @Override
    public String delbyid(Job1 job1) {
        Integer id = job1.getJid();
        try {
            job1Repository.deleteById(id);
            return "okokokok";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "fail";
    }

    @Override
    public Job1 saveAndFlush(Job1 job1) {
        return job1Repository.saveAndFlush(job1) ;
    }
}

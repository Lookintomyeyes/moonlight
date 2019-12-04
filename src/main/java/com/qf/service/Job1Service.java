package com.qf.service;

import com.qf.pojo.Job1;

import java.util.List;

/**
 * Created by HP        PC on 2019/12/4.
 */
public interface Job1Service {
    List<Job1> findAll();
    List<Job1>   findbylike(Job1 job1);
    String delbyid(Job1 job1);

    Job1 saveAndFlush(Job1 job1);
}

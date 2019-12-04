package com.qf.dao;

import com.qf.pojo.Job1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by HP        PC on 2019/12/4.
 */
@Mapper
public interface Job1Dao {
    List<Job1> findbylike(Job1 job1);
}

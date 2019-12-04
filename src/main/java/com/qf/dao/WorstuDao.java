
package com.qf.dao;

import com.qf.pojo.Worstu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorstuDao {
    public Worstu findLy(int id);
}


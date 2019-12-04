package com.qf.service;

import com.qf.pojo.Catalog1;

import java.util.List;

/**
 * Created by HP        PC on 2019/12/4.
 */
public interface Catalog1Service {
    public List<Catalog1> findAll();

    Catalog1 saveAndFlush(Catalog1 catalog1);

    String delbyid(Catalog1 catalog1);
}

package com.qf.service.impl;

import com.qf.pojo.Catalog1;
import com.qf.repository.Catalog1Repository;
import com.qf.service.Catalog1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HP        PC on 2019/12/4.
 */
@Service
public class Catalog1Serviceimpl  implements Catalog1Service {
    @Autowired
    private Catalog1Repository catalog1Repository;
    @Override
    public List<Catalog1> findAll() {
        return catalog1Repository.findAll();
    }

    @Override
    public Catalog1 saveAndFlush(Catalog1 catalog1) {
        return  catalog1Repository.saveAndFlush(catalog1);
    }

    @Override
    public String delbyid(Catalog1 catalog1) {
        Integer id = catalog1.getId1();
        try {
            catalog1Repository.deleteById(id);
            return "okokokok";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "fail";
    }
}

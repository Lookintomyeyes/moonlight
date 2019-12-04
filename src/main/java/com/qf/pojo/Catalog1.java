package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by HP        PC on 2019/12/4.
 */
@Entity
@Table(name="catalog1")
@Data
public class Catalog1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id1;
    private  String  name1;
}

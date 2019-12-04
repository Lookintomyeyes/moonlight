package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by HP        PC on 2019/12/4.
 */
@Entity
@Table(name="job1")
@Data
public class Job1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jid;
    private String jname;
    private String jcompany;
    private String district;
    private String salary;
    private String paystyle;
    private String lable;

}

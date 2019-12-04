package com.qf.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "worstu")
@Data
@Component
public class Worstu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int user_id;
    private int stu;
    private int jid;
}


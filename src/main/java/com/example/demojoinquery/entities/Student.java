package com.example.demojoinquery.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String school;
    @ManyToMany
    private List<Subjects> subjects=new ArrayList<>();
    @OneToOne(mappedBy = "student")
    private Province province;
}

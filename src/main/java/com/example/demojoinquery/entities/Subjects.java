package com.example.demojoinquery.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int duration;
    private double fees;
    @ManyToMany(mappedBy = "subjects")
    private List<Student> students=new ArrayList<>();

}

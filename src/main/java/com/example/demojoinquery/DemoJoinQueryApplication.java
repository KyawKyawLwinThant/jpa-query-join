package com.example.demojoinquery;

import com.example.demojoinquery.service.StudentService;
import com.example.demojoinquery.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoJoinQueryApplication {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(DemoJoinQueryApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(){
        return args -> {
          //  studentService.createDb();
            print(studentService.findStudentNameProvinceSubjects("Java"));
            JPAUtil.checkData("select * from province");
            JPAUtil.checkData("select * from student");
            JPAUtil.checkData("select * from subjects");
            JPAUtil.checkData("select * from student_subjects");
        };
    }

    public static void print(List<Object> objects){
        for(Object object:objects){
            Object[] obj=(Object[]) object;
            System.out.println(String.format("Name : %s , Province : %s , Subject :%s",obj[0],obj[1],obj[2]));
        }
    }
}

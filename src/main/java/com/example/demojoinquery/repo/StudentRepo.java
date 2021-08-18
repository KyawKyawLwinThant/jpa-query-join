package com.example.demojoinquery.repo;

import com.example.demojoinquery.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    @Query("select s.name,p.name,sub.name from Province p join p.student s join s.subjects sub where sub.name=?1")
    List<Object> findStudentNameProvinceSubject(String subject);
}

package com.example.demojoinquery.repo;

import com.example.demojoinquery.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subjects,Integer> {
}

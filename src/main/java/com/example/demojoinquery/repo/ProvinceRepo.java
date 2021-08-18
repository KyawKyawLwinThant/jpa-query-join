package com.example.demojoinquery.repo;

import com.example.demojoinquery.entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepo extends JpaRepository<Province,Integer> {
}

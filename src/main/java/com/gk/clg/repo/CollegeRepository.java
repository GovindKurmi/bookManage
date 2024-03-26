package com.gk.clg.repo;

import com.gk.clg.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Integer> {
}
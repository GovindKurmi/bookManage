package com.gk.clg.service;

import com.gk.clg.model.College;
import com.gk.clg.repo.CollegeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {

    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getColleges() {
        log.warn("inside getColleges method");
        return collegeRepository.findAll();
    }

    public College addCollege(College college) {
        return collegeRepository.save(college);
    }
}

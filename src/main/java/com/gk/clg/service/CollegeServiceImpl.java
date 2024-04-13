package com.gk.clg.service;

import com.gk.clg.exception.NotFoundException;
import com.gk.clg.model.College;
import com.gk.clg.repo.CollegeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CollegeServiceImpl implements CollegeService {

    private final CollegeRepository collegeRepository;

    @Cacheable("colleges")
    @Override
    public List<College> getColleges() {
        log.warn("inside getColleges method");
        return collegeRepository.findAll();
    }

    @Override
    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    @Cacheable("college")
    @Override
    public College getCollegeById(int id) {
        return collegeRepository.findById(id).orElseThrow(() -> new NotFoundException("College data not found"));
    }
}

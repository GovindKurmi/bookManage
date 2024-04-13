package com.gk.clg.service;

import com.gk.clg.model.College;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CollegeService {
    List<College> getColleges();

    College addCollege(College college);

    College getCollegeById(int id);
}

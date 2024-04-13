package com.gk.clg.controller;

import com.gk.clg.model.College;
import com.gk.clg.service.CollegeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/colleges")
@RequiredArgsConstructor
public class CollegeController {

    private final CollegeService collegeService;

    @GetMapping("/getColleges")
    public ResponseEntity<List<College>> getColleges() {
        log.info("CollegeController::inside getColleges method");
        return ResponseEntity.ok().body(collegeService.getColleges());
    }

    @GetMapping("/getCollege/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable int id) {
        log.info("CollegeController::inside getCollegeById method");
        return ResponseEntity.ok(collegeService.getCollegeById(id));
    }

    @PostMapping("/addCollege")
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        log.info("CollegeController::inside addCollege method");
        return ResponseEntity.ok(collegeService.addCollege(college));
    }

}

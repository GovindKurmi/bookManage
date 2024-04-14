package com.gk.clg.controller;

import com.gk.clg.model.Exam;
import com.gk.clg.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exams")
@RequiredArgsConstructor
public class ExamController {

    private final ExamService examService;

    @GetMapping("/get-exam")
    public ResponseEntity<Exam> getExamDetails() {
        return ResponseEntity.ok(examService.getExamDetails());
    }

}

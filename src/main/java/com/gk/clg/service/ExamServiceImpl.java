package com.gk.clg.service;

import com.gk.clg.model.Exam;
import com.gk.clg.repo.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;


    @Override
    public Exam getExamDetails() {
        return examRepository.findById(1L).orElseThrow(() -> new RuntimeException("Exam not found"));
    }
}

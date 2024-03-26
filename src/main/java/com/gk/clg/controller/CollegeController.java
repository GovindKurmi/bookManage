package com.gk.clg.controller;

import com.gk.clg.model.College;
import com.gk.clg.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getColleges")
    public List<College> getColleges() {
        log.info("inside getColleges method");
        return bookService.getColleges();
    }

    @PostMapping("/addCollege")
    public College addCollege(@RequestBody College college) {
        return bookService.addCollege(college);
    }

}

package com.gk.clg.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

@Service
public class StudentRepository {
    @Autowired
    private JdbcClient jdbcClient;

    public String getStudentName(int id) {
        JdbcClient.StatementSpec sql = jdbcClient.sql("select name from student where id = :id");

        return null;
    }
}

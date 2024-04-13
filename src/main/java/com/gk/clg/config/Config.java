package com.gk.clg.config;

import com.gk.clg.model.Emp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Emp firstBean() {
        return new Emp(1, "Govind", 20000);
    }

    @Bean
    public Emp secondBean() {
        return new Emp(1, "Sunil", 30004);
    }
}

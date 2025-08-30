package com.renbatests.postgres_cnx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    private StudentLoggingService studentLoggingService;

    @Override
    public void run(String... args) {
        studentLoggingService.logAllStudents();
    }
}

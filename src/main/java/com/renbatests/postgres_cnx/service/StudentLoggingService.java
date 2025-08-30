package com.renbatests.postgres_cnx.service;

import com.renbatests.postgres_cnx.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class StudentLoggingService {

    private final StudentService studentService;

    public StudentLoggingService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void logAllStudents() {
        try {
            List<Student> students = studentService.getAllStudents();
            if (students.isEmpty()) {
                log.info("No students found in the database.");
            } else {
                log.info("Students retrieved:");
                students.forEach(student ->
                        log.info("  - Id: {}, Name: {}, Years: {}",
                                student.getId(), student.getName(), student.getYears()));
            }
        } catch (Exception e) {
            log.error("Error fetching students", e);
        }
    }

}
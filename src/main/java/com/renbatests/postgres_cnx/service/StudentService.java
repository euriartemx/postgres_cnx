package com.renbatests.postgres_cnx.service;

import java.util.List;
import com.renbatests.postgres_cnx.model.Student;
import com.renbatests.postgres_cnx.repo.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
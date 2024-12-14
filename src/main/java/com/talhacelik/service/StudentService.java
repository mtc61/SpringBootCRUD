package com.talhacelik.service;


import com.talhacelik.model.Student;
import com.talhacelik.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}

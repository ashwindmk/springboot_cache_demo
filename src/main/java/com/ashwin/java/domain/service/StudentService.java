package com.ashwin.java.domain.service;

import com.ashwin.java.domain.model.Student;
import com.ashwin.java.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student findById(long id) {
        return studentRepository.findById(id);
    }
}

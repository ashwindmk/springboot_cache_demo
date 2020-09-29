package com.ashwin.java.domain.repository;

import com.ashwin.java.domain.model.Student;

import java.util.List;

public interface StudentRepository {
    public Student findById(Long id);
    public List<Student> findAll();
}

package com.ashwin.java.api.controller;

import com.ashwin.java.data.source.StudentSource;
import com.ashwin.java.domain.model.Student;
import com.ashwin.java.domain.repository.StudentRepository;
import com.ashwin.java.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<Student> getById(@RequestParam(value = "id") long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }
}

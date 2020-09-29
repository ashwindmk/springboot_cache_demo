package com.ashwin.java.data.source;

import com.ashwin.java.domain.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentSource {
    private List<Student> students;

    public StudentSource() {
        students = new ArrayList<>();
        students.add(new Student(1L, "Alice Williams"));
        students.add(new Student(2L, "Bob Obrien"));
        students.add(new Student(3L, "Clara Pattrick"));
        students.add(new Student(4L, "Daniel Wilson"));
    }

    public List<Student> getAll() {
        return students;
    }
}

package com.ashwin.java.data.repositoryimpl;

import com.ashwin.java.data.source.StudentSource;
import com.ashwin.java.domain.model.Student;
import com.ashwin.java.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private StudentSource studentSource;

    @Override
    @Cacheable(value = "StudentCache", key = "#id")
    public Student findById(Long id) {
        try {
            Thread.sleep(5000L);
            Optional<Student> student = studentSource.getAll().stream()
                    .filter(s -> s.getId().equals(id))
                    .findFirst();
            return student.orElse(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}

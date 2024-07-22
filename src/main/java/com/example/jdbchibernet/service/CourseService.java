package com.example.jdbchibernet.service;

import com.example.jdbchibernet.model.Course;
import com.example.jdbchibernet.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo repo;
    public void addCourse(Course course) {
        repo.save(course);

    }

    public List<Course> getCourse() {
        return repo.findAll();
    }

    public List<Course> getByAuthor(String author) {
        return repo.findByAuthor(author);
    }
}

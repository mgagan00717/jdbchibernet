package com.example.jdbchibernet.controller;

import com.example.jdbchibernet.model.Course;
import com.example.jdbchibernet.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {


    @Autowired
    CourseService courseService;

    @PostMapping ("/addcourses")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @GetMapping("/allcourses")
    public List<Course> getAllCourses() {
        return courseService.getCourse();
    }
    @GetMapping("/allauthor")
    public List<Course> getAllAuthor(@PathVariable  String author) {
        return courseService.getByAuthor(author);
    }

}

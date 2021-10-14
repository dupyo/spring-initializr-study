package com.springinitializr.study.controller;

import com.springinitializr.study.prac.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
    // course 데이터를 반환하는 메소드
    @GetMapping("/courses")
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("스프링");
        course.setDays(35);
        course.setTutor("홍두표");
        return course;
    }
}
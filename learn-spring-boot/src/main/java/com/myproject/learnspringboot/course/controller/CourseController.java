package com.myproject.learnspringboot.course.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.learnspringboot.course.bean.Course;

@RestController
public class CourseController {

	// I want to return a list of courses if the user types the url:
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return List.of(new Course(10, "Learn Microservices", "César Campuzano"),
				new Course(11, "Another Java Course", "Not by César"));

	}

	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getACourse() {
		return new Course(2, "Another Java Course", "Not by César");
	}
}

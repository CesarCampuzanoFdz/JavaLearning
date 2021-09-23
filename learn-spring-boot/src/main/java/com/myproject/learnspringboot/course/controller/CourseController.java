package com.myproject.learnspringboot.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.learnspringboot.course.bean.Course;
import com.myproject.learnspringboot.course.repository.CourseRepository;

@RestController
public class CourseController {

	// ---------------------Hardcoded data---------------------
	// I want to return a list of courses if the user types the url:
	// http://localhost:8080/courseshc
	@GetMapping("/courseshc")
	public List<Course> getAllCourseshc() {
		return List.of(new Course(10, "Learn Microservices", "César hardcoded"),
				new Course(11, "Another Java Course", "Not by César"));
	}

	// http://localhost:8080/courseshc/1
	@GetMapping("/courseshc/1")
	public Course getACoursehc() {
		return new Course(2, "Another Java Course", "Not by César");
	}

	// ---------------------Database data---------------------
	@Autowired
	private CourseRepository repo;

	// http://localhost:8080/courseshc
	@GetMapping("/coursesdb")
	public List<Course> getAllCoursesdb() {
		return repo.findAll();
	}

	// http://localhost:8080/coursesdb/<id>
	@GetMapping("/coursesdb/{id}")
	public Course getACoursehc(@PathVariable long id) {
		Optional<Course> course = repo.findById(id);
		if (course.isPresent()) {
			return course.get();
		} else {
			throw new RuntimeException("Course  with id " + id + "not found");
		}
	}

	// POST - Create a new resource
	// Collect a new course via JSON and add it to the database:
	@PostMapping("/coursesdb")
	public void createCourse(@RequestBody Course course) {
		repo.save(course);
	}

	// PUT - Update a resource
	// Collect a new course via JSON and modify the database:
	@PutMapping("/coursesdb/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repo.save(course);
	}

	// DELETE - Delete a resource
	// Delete a entry in the db:
	@DeleteMapping("/coursesdb/{id}")
	public void deleteCourse(@PathVariable long id) {
		Optional<Course> course = repo.findById(id);
		if (course.isPresent()) {
			repo.deleteById(id);
		} else {
			throw new RuntimeException("Course  with id " + id + "not found");
		}
	}

}
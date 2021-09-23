package com.myproject.learnspringboot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.learnspringboot.course.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

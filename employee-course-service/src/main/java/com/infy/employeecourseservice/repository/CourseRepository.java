package com.infy.employeecourseservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.employeecourseservice.model.Course;

public interface CourseRepository extends CrudRepository<Course,String>{


	List<Course> getCourseBycourseId(String courseId);

	//List<Course> getAll();

}

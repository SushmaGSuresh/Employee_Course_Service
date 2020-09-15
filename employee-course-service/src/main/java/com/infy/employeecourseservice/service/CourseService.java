package com.infy.employeecourseservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.employeecourseservice.model.Course;
import com.infy.employeecourseservice.repository.CourseRepository;

@Service
public class CourseService {

	
	@Autowired
	CourseRepository repository;
	
	public List<Course> getAllCourses(){
		List<Course> course=new ArrayList<Course>();
		repository.findAll().forEach(course1->course.add(course1));
		return course;
	} 
	
	public Course getCourseById(String courseId)   
	{  
	return repository.findById(courseId).get() ;
	}  
	
	public void createCourse(Course course)   
	{  
	repository.save(course);  
	}  
	
	public void deleteCourse(String courseId)   
	{  
	repository.deleteById(courseId);  
	}  
	
	public void updateCourse(Course course, String courseId)   
	{  
	repository.save(course);  
	}  

}

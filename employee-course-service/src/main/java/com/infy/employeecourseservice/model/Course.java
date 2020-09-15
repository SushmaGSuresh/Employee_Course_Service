package com.infy.employeecourseservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
	@Column
	private String courseId;
	
	@Column
	private String courseName;
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourse_id(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourse_name(String courseName) {
	}
	

}

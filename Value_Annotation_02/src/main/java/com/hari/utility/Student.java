package com.hari.utility;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.studentName}")
	public String studentName;
	@Value("${student.intrestedCourse}")
	public String intrestedCourse;
	@Value("${student.hobby}")
	public String hobby;
	
	
	public void displayStudent() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Intrested Course: "+intrestedCourse);
		System.out.println("Hobby: "+hobby);
	}
	

}

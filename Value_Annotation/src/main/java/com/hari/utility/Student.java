package com.hari.utility;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	public String studentName;
	public String intrestedCourse;
	public String hobby;
	public String getStudentName() {
		return studentName;
	}
	@Value("${student.studentName}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//@Required:Compulsory we have to provide value otherwise it will throw Exception
	@Required
	@Value("${student.intrestedCourse}")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudent() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Intrested Course: "+intrestedCourse);
		System.out.println("Hobby: "+hobby);
	}
	
/*
 * 1.If we use @value @Required above the setter method it will use setter method to initiate the value
 * 2.If we use @value @Required above the variable declaration it wont use setters
 */
}

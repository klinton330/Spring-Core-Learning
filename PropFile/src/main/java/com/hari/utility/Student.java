package com.hari.utility;

public class Student {
	
	public String studentName;
	public String intrestedCourse;
	public String hobby;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getIntrestedCourse() {
		return intrestedCourse;
	}
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudent() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Intrested Course: "+intrestedCourse);
		System.out.println("Hobby: "+hobby);
	}
	

}

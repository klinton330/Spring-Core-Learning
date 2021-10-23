package com.hari.utility;

import org.springframework.stereotype.Component;


public class College {
	
	Principal principal;
	
	Teacher teacher;
	
	/*Injecting principal object using constructor
	public College(Principal principal) {
		this.principal = principal;
	}
	*/
	
	/*injecting principal object using Setters and Getters*/
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	
	public void display()
	{
		System.out.println("This is college Bus");
		principal.principalInfo();
		teacher.teach();
	}


	

}

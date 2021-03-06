package com.hari.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	/*@Value("${college.name}") if using @Required this way wont supported so u have to go for setters*/
	String collegeName;
	
	@Required
	@Value("${college.name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Autowired
	Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
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
		System.out.println("My college Name is"+collegeName);
		principal.principalInfo();
		teacher.teach();
	}


	

}

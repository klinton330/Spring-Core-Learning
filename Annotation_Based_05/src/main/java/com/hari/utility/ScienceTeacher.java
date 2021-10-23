package com.hari.utility;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("I am science Teacher");

	}

}

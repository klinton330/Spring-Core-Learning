package com.hari.utility;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	public void teach() {
	     System.out.println("I am the Maths Teacher");
	}

}

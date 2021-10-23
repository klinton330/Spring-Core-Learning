package com.hari.basics.inter;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println("I drive Car");

	}

}

package com.hari.basics.inter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	//It cannot able to acces tyre object if we not using @Autowired
	@Autowired
	private Tyre tyre;
	public void drive() {
		System.out.println("I drive Car" +tyre);

	}

}

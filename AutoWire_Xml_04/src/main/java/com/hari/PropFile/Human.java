package com.hari.PropFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octobusHeart")
	Heart h;
	
	public void Display()
	{
		System.out.println("The animal is"+" "+h.getAnimal()+" "
	+" has"+" "+h.noOfHeart+" "+"of Hearts" );
	}

}

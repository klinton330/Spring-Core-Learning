package com.hari.AutoWire_Xml_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Heart {
	//First it check with TYPE than it check with NAME if both are mismatch Thirdly it look for Qualifer if not
	//qualifier present it will throw an exception
	@Autowired
	Pump p;
	
	@Autowired
	@Qualifier("manLungs")
	Lungs lung;
	
	public void getLungDetails()
	{
		System.out.println("This is"+lung.getAnimal()+" "+"it has"+" "+lung.getNoOfLungs()+" "+"Lungs");
	}
	
	public void status()
	{
		if(p!=null)
			p.isPumping();
		else
			System.out.println("Parson died");
	}
   
}
	
	
	
/*@Autowired
@Qualifier("manLungs")
	public void setLung(Lungs lung) {
		this.lung = lung;
	}*/
	
	
	

 
   
   
/*	
 * @Autowired
 * public void setP(Pump p) {
		System.out.println("Inside setters");
		this.p = p;
	}*/


	



/*
This is Autowired on constructor ,Object pump p is getting matched with byType in xml configuration 
and inject its corresponding object
*/
	/*@Autowired
	public Heart(Pump p) {
		super();
		System.out.println("Inside Constructor");
		this.p = p;
	}*/


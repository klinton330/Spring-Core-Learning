package com.hari.basics.inter;

public class Tyre {
	
	private String tyreName;
	

	
	
	public Tyre(String tyreName) {
		super();
		this.tyreName = tyreName;
	}




	public void getName()
	{
		System.out.println("The tyre is:"+tyreName);
	}
}

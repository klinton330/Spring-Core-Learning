package com.hari.basics.inter;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	

	private String tyreName;

	public String getTyreName() {
		return tyreName;
	}

	public void setTyreName(String tyreName) {
		this.tyreName = tyreName;
	}

	@Override
	public String toString() {
		return "Tyre is working";
	}
	
	
	public void getName()
	{
		System.out.println("The tyre is:"+tyreName);
	}
}

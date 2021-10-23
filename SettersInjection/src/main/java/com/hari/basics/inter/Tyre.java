package com.hari.basics.inter;

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
		return "Tyre [tyreName=" + tyreName + "]";
	}
	
	
	public void getName()
	{
		System.out.println("The tyre is:"+tyreName);
	}
}

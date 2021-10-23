package com.service.provider;

import com.service.Service;

public class Airtel {
	
	public Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void ActivatePlan()
	{
		service.service();
	}

}

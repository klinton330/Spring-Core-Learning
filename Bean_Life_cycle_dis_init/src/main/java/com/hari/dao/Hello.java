package com.hari.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean {


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello class Init method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello class Destroy method");
		
	}

}

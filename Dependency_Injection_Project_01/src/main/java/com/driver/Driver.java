package com.driver;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.provider.Airtel;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("Bean configured..");
		Airtel airtel=(Airtel) context.getBean("airtel");
		airtel.ActivatePlan();

	}

}

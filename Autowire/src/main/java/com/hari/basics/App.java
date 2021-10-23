package com.hari.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.basics.inter.Car;
import com.hari.basics.inter.Tyre;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
     // Tyre t=(Tyre)app.getBean("tyre");
     // System.out.println(t);
      Car car=(Car)app.getBean("car");
      car.drive();
      
    }
}

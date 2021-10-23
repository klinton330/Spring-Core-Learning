package com.hari.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.basics.inter.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
      Vehicle v=(Vehicle) app.getBean("car");
      v.drive();
    }
}

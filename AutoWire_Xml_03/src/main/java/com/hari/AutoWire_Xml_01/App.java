package com.hari.AutoWire_Xml_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
       Heart h=(Heart) context.getBean("heart");
       h.getLungDetails();
      h.status(); 
    }
}

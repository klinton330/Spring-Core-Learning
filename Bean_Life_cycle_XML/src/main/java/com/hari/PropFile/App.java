package com.hari.PropFile;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
    	//  context.registerShutdownHook(); Excute once the main method ends and destroy the bean
    	//so we can create any number of object forStudentDao
        context.registerShutdownHook();
        StudentDao s=(StudentDao) context.getBean("studentDao");
        s.selectRows();
       
    }
}

package com.hari.PropFile;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.dao.Hello;
import com.hari.dao.StudentDao;

/**
 * InitializingBean,DisposableBean
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
        
        Hello h=context.getBean("hello",Hello.class);
       
    }
}

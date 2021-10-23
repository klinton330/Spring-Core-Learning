package com.hari.PropFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.utility.Student;

/**
 * Loading the data from property file using annotation by Variable
 * 
 * @value - used to assign a value
 * @Required-compulsory we have to give value
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
       Student s=(Student) context.getBean("student");
       s.displayStudent();
    }
}

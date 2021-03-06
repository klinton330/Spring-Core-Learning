package com.hari.PropFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.utility.College;
import com.hari.utility.School;

/**
 * Usage of <context:component-scan base-package=package1">
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext contest=new ClassPathXmlApplicationContext("Bean.xml");
       School college= (School) contest.getBean("schoolBean");
       college.display();
    }
}

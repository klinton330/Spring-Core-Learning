package com.hari.PropFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.config.CollegeConfig;
import com.hari.utility.College;
import com.hari.utility.School;

/**
 * Usage of 
 @Bean
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext contest=new AnnotationConfigApplicationContext(CollegeConfig.class);
     College college= (College) contest.getBean("workBean");
       college.display();
    }
}

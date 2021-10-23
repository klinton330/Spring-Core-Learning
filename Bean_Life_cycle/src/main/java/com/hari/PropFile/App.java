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
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        StudentDao s=(StudentDao) context.getBean("studentDao");
        s.selectRows();
       ((ClassPathXmlApplicationContext) context).close();
    }
}

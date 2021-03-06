package com.hari.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hari.utility.College;
import com.hari.utility.MathTeacher;
import com.hari.utility.Principal;
import com.hari.utility.Teacher;


@Configuration
public class CollegeConfig {
	
	
	public Teacher teacherBean()
	{
		return new MathTeacher();
	}
  
	@Bean
	public Principal principleInfo()
	{
		return new Principal();
	}
/*   @Bean
	public College collegeBean()
	{
		College college=new College(principleInfo());
		return college;
	}*/
  
  @Bean
 	public College collegeBean()
 	{
 		College college=new College();
 		college.setPrincipal(principleInfo());
 	    college.setTeacher(teacherBean());
 		return college;
 	}
   
}

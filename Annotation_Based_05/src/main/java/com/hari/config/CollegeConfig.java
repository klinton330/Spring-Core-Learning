package com.hari.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.hari.utility.College;
import com.hari.utility.MathTeacher;
import com.hari.utility.Principal;
import com.hari.utility.Teacher;


@Configuration
@ComponentScan(basePackages = "com.hari.utility")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
	
	
   
}

package com.hari.Annotation_Based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTech")
	MobileProcessor processor;
	
	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}

	public void config()
	{
		System.out.println("This is samsung mobile");
		processor.SnapDragon();
	}

}

/*
@Component -- will allow to create a object
@Autowired---allow to access the mention object
@Qualifier("mediaTech")--- help us to create requested object
@Configuration-- represent this si configuration file
@ComponentScan(basePackages ="com.hari.Annotation_Based")---Help us to scan all class in mentioned package

*/
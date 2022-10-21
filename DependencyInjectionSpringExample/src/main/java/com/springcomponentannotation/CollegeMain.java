package com.springcomponentannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//@SpringBootApplication
public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	//	SpringApplication.run(CollegeMain.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext (CollegeConfig.class);
		College c=context.getBean("collegeBean",College.class);
		c.test();
	}

}

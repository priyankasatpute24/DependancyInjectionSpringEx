package com.springframework.requiredannonation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainTestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainTestApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/requiredannonation/applicationContext.xml");
		 
		 Student student = (Student) context.getBean("student");
		 System.out.println("Name : " + student.getName() );
		 System.out.println("Age : " + student.getAge() );

	}

}

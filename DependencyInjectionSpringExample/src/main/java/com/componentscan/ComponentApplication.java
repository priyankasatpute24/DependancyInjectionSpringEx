package com.componentscan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ComponentApplication {

	public static void main(String[] args) {
	

		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
     context.scan("com.example.demo");
     context.refresh();

    
     ComponentDemo componentDemo
         = context.getBean(ComponentDemo.class);
     componentDemo.demoFunction();

    
     context.close();
	}

}

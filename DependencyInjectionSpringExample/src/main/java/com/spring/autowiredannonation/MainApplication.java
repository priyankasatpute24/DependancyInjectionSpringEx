package com.spring.autowiredannonation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiredannonation/applicationContext.xml");
		 TextEditor te = (TextEditor) context.getBean("textEditor");
		 te.spellCheck();
	}

}

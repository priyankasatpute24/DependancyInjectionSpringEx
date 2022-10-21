package com.dependencyinjection.namespace.p.beans;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(" com/dependencyinjection/namespace/p/beans/applicationContext.xml");
		 Employee2 emp = (Employee2) context.getBean("emp");
		 System.out.println(emp);
	}

}

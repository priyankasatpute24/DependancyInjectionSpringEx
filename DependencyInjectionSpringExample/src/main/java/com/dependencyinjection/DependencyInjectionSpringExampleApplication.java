package com.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependencyinjection.CollectionConstrustorInjection.Question;
import com.dependencyinjection.ConstructorwithdependetObject.Employee1;
import com.dependencyinjection.primitivestringbased.Employee;

@SpringBootApplication
public class DependencyInjectionSpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSpringExampleApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dependencyinjection/CollectionConstrustorInjection/applicationContext.xml");
		Question q = (Question) context.getBean("q");
		q.displayInfo();

	}

}

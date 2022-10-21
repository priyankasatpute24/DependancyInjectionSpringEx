package com.dependencyinjection.namespace.p.collectionFramework;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainClassApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dependencyinjection/namespace/p/collectionFramework/applicationContext.xml");
		JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
//		 jc.getAddressList();
//		 jc.getAddressSet();
//		 jc.getAddressMap();
//		 jc.getAddressProp();
		 System.out.println("AddressList :"+jc.getAddressList());
		 System.out.println("AddressSet :"+jc.getAddressSet());
		 System.out.println("AddressMap :"+jc.getAddressMap());
		 System.out.println("AddressProp :"+jc.getAddressProp());
		 
		 
	}

}

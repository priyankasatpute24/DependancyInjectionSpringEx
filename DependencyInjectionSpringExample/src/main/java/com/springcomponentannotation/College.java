package com.springcomponentannotation;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	public void test() {
		System.out.println("Test college method");
	}
}

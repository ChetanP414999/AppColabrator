package com.cjc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ap=new ClassPathXmlApplicationContext("com/cjc/config.xml");
		
		
		Kitkat k1=(Kitkat) ap.getBean("k1");
		System.out.println(k1);
		ap.registerShutdownHook();	
		
	System.out.println("hemant added");
		
	
	}
	

	
}

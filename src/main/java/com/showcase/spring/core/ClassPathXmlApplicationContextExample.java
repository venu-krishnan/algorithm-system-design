package com.showcase.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Simple ClassPathXmlApplicationContext load example
 * 
 */
public class ClassPathXmlApplicationContextExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/appContext.xml");
	
		//helloWorld bean is loaded via ApplicationContext
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

	}
}

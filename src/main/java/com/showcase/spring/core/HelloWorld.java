package com.showcase.spring.core;

/**
 * 
 * @author venutechie
 *
 */
public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	} 

	public void getMessage() {
		System.out.println("printing your Message : " + message);
	}

}

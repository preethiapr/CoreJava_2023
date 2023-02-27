package com.test;

import java.lang.reflect.Method;

public class MethodDemo {
	
	

	public static void main(String[] args) {
	 MethodDemo d = new MethodDemo();
	 String name = d.getData();
	 System.out.println(name);
	 getData2();
	 
	}
	
	public String getData() {
		System.out.println("Hello world");
		return "rahul shetty";
		
	}
	
	public static String  getData2() {
		System.out.println("Hello World");
		return "Rahul Shetty";
		
		
	}
	
	

}

package com.sprinframework.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprinframework/ref/refconfig.xml");
		A aref =(A) context.getBean("aref");
		
		System.out.println(aref.getX());
		System.out.println(aref.getOb());
		System.out.println(aref.getOb().getY());
		
	}

}

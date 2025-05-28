package com.springframework.auto.wire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireWithAnnotation {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/auto/wire/annotation/annotationautowireconfig.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);

	}

}

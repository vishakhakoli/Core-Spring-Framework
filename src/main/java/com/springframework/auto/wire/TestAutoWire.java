package com.springframework.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/auto/wire/autowireconfig.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);

	}

}

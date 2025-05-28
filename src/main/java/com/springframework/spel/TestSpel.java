package com.springframework.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/spel/spelconfig.xml");
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
	}

}

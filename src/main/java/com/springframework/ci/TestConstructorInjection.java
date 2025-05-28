package com.springframework.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/ci/ciconfig.xml");
		//Person person = (Person) context.getBean("person");
		Addition add= (Addition) context.getBean("add");
		
		//System.out.println(person);
		
		add.doSome();

	}

}

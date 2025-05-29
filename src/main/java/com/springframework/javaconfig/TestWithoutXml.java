package com.springframework.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithoutXml {

	public static void main(String[] args) {
	
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/javaconfig/javaconfig.xml");
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = context.getBean("temp",Student.class);
		System.out.println(student);
		student.study();
	}

}

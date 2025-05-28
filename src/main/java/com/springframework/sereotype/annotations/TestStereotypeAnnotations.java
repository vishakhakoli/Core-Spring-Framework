package com.springframework.sereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotypeAnnotations {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/sereotype/annotations/sereotypeannotationconfig.xml");
		
		Student student = context.getBean("stud" , Student.class);
		//System.out.println(student);
		//System.out.println(student.getAdresses());
		//System.out.println(student.getAdresses().getClass().getName());
		
		System.out.println(student.hashCode());
		
		Student student1 = context.getBean("stud" , Student.class);
		
		System.out.println(student1.hashCode());
		
		System.out.println("-------------------------------------------");
		
		Teacher teacher = context.getBean("teacher" , Teacher.class);
		
		System.out.println(teacher.hashCode());
		
		Teacher teacher1 = context.getBean("teacher" , Teacher.class);
		
		System.out.println(teacher1.hashCode());
	}

}

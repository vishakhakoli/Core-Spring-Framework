package com.springframework.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollections {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springframework/standalone/collections/standalonecollectionconfig.xml");
		Person person = context.getBean("person1",Person.class);
		
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("-----------------------------------------");
		System.out.println(person.getFeeStructure());
		System.out.println(person.getFeeStructure().getClass().getName());
		System.out.println("-----------------------------------------");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());
	}

}

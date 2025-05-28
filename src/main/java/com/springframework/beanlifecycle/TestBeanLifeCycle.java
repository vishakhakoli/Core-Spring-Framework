package com.springframework.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycle {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/beanlifecycle/beanlifecycleconfig.xml");
		
		/*
		 * Book book=(Book) context.getBean("book"); System.out.println(book);
		 * 
		 * 
		 * Anime anime = (Anime) context.getBean("anime"); System.out.println(anime);
		 */
		
		Comic comic =(Comic) context.getBean("comic");
		System.out.println(comic);
		context.registerShutdownHook();
	}

}

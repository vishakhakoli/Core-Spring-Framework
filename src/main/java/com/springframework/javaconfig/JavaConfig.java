package com.springframework.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springframework.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name={"student","temp"})
	public Student getStudent()
	{
		Student student = new Student(getSamosa());
		return student;
	}
	
	
	

}

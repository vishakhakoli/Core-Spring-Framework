package com.springframework.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Comic {
	
	private String comicName;

	public String getComicName() {
		return comicName;
	}

	public void setComicName(String comicName) {
		this.comicName = comicName;
	}

	public Comic() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "I like to read " + comicName + " comic.";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Starting reading "+ this.comicName);
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Finished reading "+ this.comicName);
	}
	
	
	

}

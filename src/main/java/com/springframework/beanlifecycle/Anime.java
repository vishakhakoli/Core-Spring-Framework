package com.springframework.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Anime implements InitializingBean,DisposableBean  {
	
	private String animeName;
	private String animeGenre;
	public String getAnimeName() {
		return animeName;
	}
	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}
	public String getAnimeGenre() {
		return animeGenre;
	}
	public void setAnimeGenre(String animeGenre) {
		this.animeGenre = animeGenre;
	}
	public Anime() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  animeName + " is a " + animeGenre + " anime.";
	} 
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Starting season 1 of Haikyu!!");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Going to watch Spy family as Haikyu is finished.");
		
	}

}

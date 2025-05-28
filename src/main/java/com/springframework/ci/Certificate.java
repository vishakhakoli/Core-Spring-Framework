package com.springframework.ci;

public class Certificate {
	private String name;
	
	Certificate(String name)
	{
		this.name=name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	

}

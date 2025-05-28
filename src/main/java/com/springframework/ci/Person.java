package com.springframework.ci;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> lists;
	
	Person(String name , int personid,Certificate certi, List<String> lists)
	{
		this.name=name;
		this.personId=personid;
		this.certi=certi;
		this.lists=lists;
	}

	@Override
	public String toString() {
		return this.name +" : "+this.personId + " has certificate of { "+this.certi+" } in " + this.lists;
	}
	
	

}

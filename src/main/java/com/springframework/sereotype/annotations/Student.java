package com.springframework.sereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stud")
@Scope("prototype")
public class Student {
	
	@Value("Vishakha")
	private String studentName;
	
	@Value("Sangli")
	private String city;
	
	@Value("#{lists}")
	private List<String> adresses;
	
	public List<String> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<String> adresses) {
		this.adresses = adresses;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	

}

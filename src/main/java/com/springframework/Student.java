package com.springframework;

public class Student {
	private int studentId;
	private String studenname;
	private String studentAddress;
	
	public Student() {
		
	}
	

	public Student(int studentId, String studenname, String studentAddress) {
		this.studentId = studentId;
		this.studenname = studenname;
		this.studentAddress = studentAddress;
	}
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudenname() {
		return studenname;
	}
	public void setStudenname(String studenname) {
		this.studenname = studenname;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studenname=" + studenname + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
}

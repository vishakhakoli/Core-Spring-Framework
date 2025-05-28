package com.springframework.beanlifecycle;

public class Book {
	
	private String bookName;
	private double bookPrice;
	
	public Book() {
		super();
	}
	public String getBookName() {
		return bookName;
		
	}
	public void setBookName(String bookname) {
		this.bookName = bookname;
		System.out.println("Setting book name");
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
		System.out.println("Setting book price");
	}
	
	@Override
	public String toString() {
		return "Book [ " + bookName + " , " + bookPrice + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
	

}

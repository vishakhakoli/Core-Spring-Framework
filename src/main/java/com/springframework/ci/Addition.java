package com.springframework.ci;

public class Addition {
	
	private int a;
	private int b;
	
	Addition(double a ,double b)
	{
		this.a=(int)a;
		this.b=(int) b;
		System.out.println("Constructor is : double , double");
	}
	
	Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor is : int , int");
	}
	
	Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor is : String , String");
	}
	
	
	
	public void doSome()
	{
		System.out.println("Value of a : "+this.a);
		System.out.println("Value of b : "+this.b);
		System.out.println("Sum is : "+ (this.a+this.b)); 
	}

}

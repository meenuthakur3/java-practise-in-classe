package project1;

import java.util.Scanner;
//2nd use of the the this keyword in method calling
public class thiswithmethod 
{
	public void method()
	{
		System.out.println("default method");
		this.method1(10);
	}
	public void method1(int x)
	{
		System.out.println("one parametrized method");
		this.method3(10, 12, 14);
	}
	public void method2(int x,int y)
	{  
		System.out.println("two parameterized method");
		this.method();
	}
	public void method3(int x,int y,int z)
	{   
		System.out.println("three parameterized method");
	}
	
	public static void main(String[] args)
	{
	thiswithmethod n1=new thiswithmethod();
	n1.method2(10,12);	
	}
	

}

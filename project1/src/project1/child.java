package project1;

public class child extends parent
{
	public child()
	{  this(78,90);
		System.out.println("this is child class default constructor");
	}
	
	public child(int a)
	{
		this(45,67,89);
		System.out.println("this is child class one argument constructor");
	}
	public child(int a,int b)
	{
		super(17);
		System.out.println("this is child class two argument constructor");
	}
	public child(int a,int b,int c)
	{
		this();
		System.out.println("this is child class three argument constructor");
	}
	
	public static void main(String[] args)
	{
		child c1=new child(10);

	}
}

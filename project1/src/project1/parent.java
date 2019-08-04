package project1;

public class parent
{
	public parent()
	{  this(20,30,30);
		System.out.println("this is parent class delault constructor");
		
	}
	public parent(int a)
	{
		this(10,20);
		System.out.println("this is parent class one argument constructor");
	}
	public parent(int a,int b)
	
	{  this();
		System.out.println("this is parent class two argument constructor");
	}
public parent(int a,int b,int c)
	
	{
		System.out.println("this is parent class three argument constructor");
	}

	
}


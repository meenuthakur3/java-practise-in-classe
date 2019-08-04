package project1;
/*4
 * 0
 * 1
 * 3
 * 2
 */
public class constructor {
	public constructor()
	{  this(7,8,9,7);
		System.out.println("default constructor ");
	}
public	constructor(int a)
{  this();
	System.out.println("one parameter constructor "+a);
}
public constructor(int a,int b)
{   this(4,5,6);
	System.out.println("two parameterized constructor "+a+" "+b);
}
public constructor(int a,int b,int c)
{
	this(9);
	System.out.println("three parameterized constructor "+a+" "+b+"  "+c);
}
public constructor(int a,int b,int c,int d)
{
	System.out.println("four parameterized constructor "+a+" "+b+"  "+c+" "+d);
}
public static void main(String[] args) 
{
	constructor c1=new constructor(2,3);
}

}

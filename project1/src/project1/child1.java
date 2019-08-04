package project1;

public class child1 extends parent1
{

	public void output()
	{
		System.out.println("this is child 1 class default method");
	}
	public static void main(String[] args)
	{
		child1 c1=new child1();
	//	c1.grand();
		c1.input();
		c1.output();
		
		
	}
}

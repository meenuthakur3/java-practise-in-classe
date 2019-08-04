package project1;

public class child2 extends parent1 
{

public void output()
{
	System.out.println("this is child 2 class default method");
}
public static void main(String[] args)
{
	child2 c1=new child2();
//	c1.grand();
	c1.input();
	c1.output();
}

}

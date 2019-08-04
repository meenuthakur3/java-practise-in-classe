package project1;
//calculate:-(((((10-2)+2)-2)*2)/2)=8
public class class2
{
	public int sum(int num1,int num2)
	{   int add=num1+num2;
		return add;
	}
	public int sub(int num1,int num2)
	{   int subt=num1-num2;
		return subt;
	}
	public int mult(int num1,int num2)
	{   int multi=num1*num2;
		return multi;
	}
	public void div(int num1,int num2)
	{   int divd=num1/num2;
		System.out.println("final result="+divd);
	}
public static void main(String[] args)
{   class2 c1=new class2();
	int sub=c1.sub(10,2);
	int sum=c1.sum(sub,2);
	sub=c1.sub(sum,2);
	int multi=c1.mult(sub,2);
	c1.div(multi,2);
	
}
}
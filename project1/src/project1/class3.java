package project1;
//calculate:-(((((10/2)-2)+2)-2)*2)=6
public class class3
{
		public int sum(int num1,int num2)
		{   int add=num1+num2;
			return add;
		}
		public int sub(int num1,int num2)
		{   int subt=num1-num2;
			return subt;
		}
		public void mult(int num1,int num2)
		{   int multi=num1*num2;
		     System.out.println("final result="+multi);
		}
		public int div(int num1,int num2)
		{   int divd=num1/num2;
			return divd;
		}
	public static void main(String[] args)
	{ 
		class3 c3=new class3();
		int div =c3.div(10,2);
		int sub=c3.sub(div,2);
		int sum=c3.sum(sub,2);
		sub=c3.sub(sum,2);
		c3.mult(sub,2);		
	}
	}


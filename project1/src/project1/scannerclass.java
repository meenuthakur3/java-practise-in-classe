package project1;

import java.util.Scanner;

public class scannerclass {
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
		
	}
	public int mult(int a,int b)
	{
		int c=a*b;
		return c;
		
	}
	public void div(int a,int b)
	{
		int c=a/b;
	System.out.println("final result is"+c);	
	}
	public static void main(String[] args) 
	{     int v1,v2,v3,v4,v5,v6;
		scannerclass obj=new scannerclass();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values for a , b ,c ,d , e, f");
		v1=sc.nextInt();
		v2=sc.nextInt();
		v3=sc.nextInt();
		v4=sc.nextInt();
		v5=sc.nextInt();
		v6=sc.nextInt();
		int sum=obj.sum(v1,v2);
		int sub=obj.sub(sum,v3);
		sum=obj.sum(sub,v4);
		int multi=obj.mult(sum,v5 );
		obj.div(multi,v6);
				System.out.println(sum);
				System.out.println(sub);
				System.out.println(multi);
				//System.out.println(div);
				
		
	}
}
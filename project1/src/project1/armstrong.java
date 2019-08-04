package project1;

import java.util.Scanner;

public class armstrong
{
	public static void main(String[] args)
	{
		int num,rem,rev=0,result=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number");
		num=sc.nextInt();
		int s=num;
	
		while(num>0)
			
		{
			 rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			result=result+(rem*rem*rem);
			
		}
		System.out.println(result);
		if(result==s)
		{
			System.out.println("no is ");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}

}

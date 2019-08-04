package project1;

import java.util.Scanner;

public class prime
{
	public static void main(String[] args)
	{
		//int num;
		int flag=0;
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("enter  the no ");
		num=sc.nextInt();
		*/
		for(int j=3;j<=100;j++)
		{ 
			
		for(int i=2;i<=j/2;i++)
		{
			if(j%i==0)
			{
			   flag=1;
			
			}
		}
		
		if (flag==1)
		{
			//System.out.println("no is not palindrome"+j);
		}
		else
		{
			System.out.println("no is palindrome"+j);
		}
		flag=0;
		}
		
		
		
	}

}

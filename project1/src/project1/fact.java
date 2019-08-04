package project1;

import java.util.Scanner;

public class fact 
{
	public static void main(String[] args) 
	{
		 int num;
		 int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number which factorical you want to calculate");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			 fact=fact*i;
					
			
		}
		System.out.println(fact);
		
		
		
		
	}
}

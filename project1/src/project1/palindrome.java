package project1;

import java.util.Scanner;

// 12321 no is palindrome
public class palindrome {
	public static void main(String[] args)
	{
		int num,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		num=sc.nextInt();
		int s=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
					
						
			
		}
		
		System.out.println(rev);		
		
	
	if(s==rev)
	{
		System.out.println("no is palindrome");	
	}
	else
	{
		System.out.println("no is not palindrome");
	}
	

}
}

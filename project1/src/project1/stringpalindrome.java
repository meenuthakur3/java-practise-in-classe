package project1;

import java.util.Scanner;

public class stringpalindrome {
	public static void main(String[] args) 
	{ 
		String a,b="";
		int i,length1;
		
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		length1=a.length()-1;
		System.out.println("length="+length1);
		for(i=length1;i>=0;i--)
		{
			b=b+a.charAt(i);
			
		}
		
		if(a.equalsIgnoreCase(b))
		{
		System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		
	}
	

}

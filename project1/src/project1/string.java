package project1;

import java.util.Scanner;

public class string
{
	public static void main(String[] args)
	{
		String string1,string2="";
		int length,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		string1=sc.nextLine();
		length=string1.length()-1;
		for(i=length;i>=0;i--)
		{
			string2=string2+string1.charAt(i);
			
			
		}
		if(string1.equalsIgnoreCase(string2))
		{
			System.out.println(" string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		
		
	}

}

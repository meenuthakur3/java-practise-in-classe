package project1;

public class add1to100 {
	
	
	public static void main(String[] args) 
	{
		int n=1;
		sum(n);
	}
public static void sum(int num)
{
	if(num<=100)
	{
		System.out.print(num+"  ");
	sum(num+1);
	}
	    
}

}

package project1;
//calculate fibonacci series
public class fibonacci {
	public static void main(String[] args)
	{
		int i=1,j=0;
		for(int t=0;t<=10;t++)	
		{
		int	sum=i+j;
			i=j;
			j=sum;
			System.out.println(i+"  "+j);
			
		}
	}
	
		
	

}

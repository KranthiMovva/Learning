package methods;
import java.util.Scanner;
public class PerfectnNumber {

	public static void main(String[] args) {
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		perfect(n);
	}
	public static int perfect(int n)
	{
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+"is a perfect number");
		}
		else
		{
			System.out.println(n+ "is not a perfect number");
		}
	
		return n;
	}
}



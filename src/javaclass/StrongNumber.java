package javaclass;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int temp=n;
	
		int sum=0;
		while(temp>0)
		{
			int d=temp%10;
			int prod=1;
			for(int i=d;i>=1;i--)
			{
				prod=prod*i;
			}
			sum=sum+prod;
			temp=temp/10;
			
		}
	
	if(sum==n) 
		{
	
		System.out.println(n+ "is a strong number");
	}
	else
	{
		System.out.println(n+ "is not a strong number");
		

	}
	}

}

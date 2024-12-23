package javaclass;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
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
			System.out.println(n+ "is a perfect number");
		}
		else
		{
			System.out.println(n+ "is not a given number");
		}}}
		
		/*int n=28;
		for(int i=1;i<28;i++)
		{
			if(n%i==0)
			{
				
			
		
		System.out.println(i);

	}

		}}}*/

package javaclass;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int temp1=n;
		int count=0;
		while(temp1>0)
		{
			int d=temp1%10;
			count++;
			temp1=temp1/10;
		}
		int sum=0;
		int temp2=n;
		while(temp2>0)
		{
			int d=temp2%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*d;
			}
			sum=sum+prod;
			temp2=temp2/10;
		}
		if(sum==n)
		{
			System.out.println(n+ " is arm strong");
		}
		else
		{
			System.out.println(n+ " is not an armstrong");
		}

	}

}

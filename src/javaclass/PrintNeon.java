package javaclass;
//import java.util.Scanner;
public class PrintNeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		//boolean isPerfectSqare=false;
		//int sod=0;
		int i;
		for(i=1;i<=10000;i++)
			{
				int sq=i*i;
				int sod=0;
				while(sq>0)
				{
			
					int rem=sq%10;
					sod=sod+rem;
					sq=sq/10;
			}	
	
	
	if(sod==i)
	{
		System.out.println(i+ "is a neon number");
	
	}}}}



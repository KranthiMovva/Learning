package javaclass;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=143;
		int sum=0;
		
		while(n>0)
		{
			
			int d=n%10;
			System.out.println(d);
		
			n=n/10;
		//count=count+1;
		sum=sum+d;
		}
	System.out.println(sum);
	
}}


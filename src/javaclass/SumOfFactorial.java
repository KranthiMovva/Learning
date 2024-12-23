package javaclass;
import java.util.Scanner;
public class SumOfFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fact=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
			sum=sum+fact;
		}
	
		System.out.println(sum);
		

	}

}

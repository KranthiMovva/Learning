package javaclass;
import java.util.Scanner;
public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		while(n>0)
		{
			if(n%2!=0)
			{
				int d=n%10;
				System.out.println(d);
				n=n/10;
			}
			
		}
	}

}

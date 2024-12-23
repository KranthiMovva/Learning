package javaclass;
import java.util.Scanner;
public class WhileDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		while(n>0)
		{
			int d=n%10;
			
			System.out.println(d);
			n=n/10;
		}
		

	}

}

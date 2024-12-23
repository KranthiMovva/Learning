package methods;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		factorial(n);
	}
		public static void factorial(int n)
		{
			int prod=1;
			for(int i=n;i>=1;i--)
			{
				prod=prod*i;
			}
			System.out.println(prod);
		}

	

}

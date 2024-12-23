package methods;
import java.util.Scanner;
public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
spy(n);
	}
		public static void spy(int n)
		{
			int sum=0;
			int prod=1;
			int temp=n;
		
			while(temp>0)
			{
				int d=temp%10;
				sum=sum+d;
				prod=prod*d;
				temp=temp/10;
			}
			if(sum==prod)
			{
				System.out.println("it is a spy number");
			}
			else
			{
				System.out.println("it is not a spy number");
			}
		}
	}



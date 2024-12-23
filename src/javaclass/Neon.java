package javaclass;
import java.util.Scanner;
public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int sq=n*n;
		int sod=0;
		while(sq>0)
		{
			int rem=sq%10;
			sod=sod+rem;
			sq=sq/10;
		}
if(sod==n)
{
	System.out.println(n+ "is a neon number");
}
else
{
	System.out.println(n+ "is not a neon number");
}
	}

}

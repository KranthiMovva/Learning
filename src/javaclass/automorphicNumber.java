package javaclass;
import java.util.Scanner;
public class automorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
int n=scan.nextInt();
int p=0;
int d=10;
int k=n*n;
while(p<n)
{
	p=k%10;
	d=d*10;
}
if(p==n)
{
	System.out.println("Automorphic number");
}
else
{
	System.out.println("not automorphic number");
}

	}

}

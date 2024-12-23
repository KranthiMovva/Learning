package mock_1;
import java.util.Scanner;
public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
int sq=n*n;
int temp=n;
int ld1=0;
int ld2=0;
int ld3=0;
while(temp>0)
{
	int d1=temp%10;
	
	temp=temp/10;
	ld1=d1;
	temp=temp/10;
	System.out.print(ld1);break;

	int d2=temp%10;
	ld2=d2;
	temp=temp/10;
	System.out.print(ld2);break;
	
	int d3=temp%10;
	ld3=d3;
	temp=temp/10;
	System.out.print(ld3);
	}
	}}



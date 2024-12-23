package javaclass;
import java.util.Scanner;
public class MtoNDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
for(int i=m;i<=n;i++)
{
	int temp=i;
	//int count=0;
	while(temp>0) {
		int d=temp%10;
		//if(d%2==0)
		{
		//count++;
		}
		temp=temp/10;
	}
		System.out.println(i);
	}
	//System.out.println(i+ "=" +count);
}
	}



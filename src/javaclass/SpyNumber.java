package javaclass;
//import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*int n=2368943;

int sod=0;
int pod=1;

while(n>0)
{
	int d=n%10;
	sod=sod+d;
	pod=pod*d;
	n=n/10;
}
	if(sod==pod)
	{
		System.out.println("spy number");
		
	}
	else
	{
		System.out.println("not spy number");
		
	}}

	}*/
		int sum=0;
		for(int i=1;i<=1000;i++)
		{
			int temp=i;
			int sod=0;
			int pod=1;
			
			while(temp>0)
			{
				int d=temp%10;
				sod=sod+d;
				pod=pod*d;
				temp=temp/10;
			}
			if(sod==pod)
			{
				sum=sum+i;
			}
		}
		
				System.out.println(sum);
	
				}}
		



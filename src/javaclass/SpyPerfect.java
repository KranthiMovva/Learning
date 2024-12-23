package javaclass;
import java.util.Scanner;
public class SpyPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int j;
	
int countSpy=0;    //check if 13th spy number is a perfect number

for(int i=1;i<n;i++)
{
	int sod=0;
	int pod=1;
	int temp=i;
	while(temp>0)
	{
		int d=temp%10;
		sod=sod+d;
		pod=pod*d;
		temp=temp/10;
	}
	if(sod==pod)
	{
		countSpy++;
		if(countSpy==13)
		{
			System.out.println(i);
			int sopf=0;
			for( j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sopf=sopf+j;
				}
			}
			if(sopf==i)
			{
				System.out.println(i+ "is a perfect number");
			}
			else
			{
				System.out.println(i+ "is not a perfect number");
			}
	
		}}}}}
		



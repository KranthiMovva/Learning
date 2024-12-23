package javaclass;

public class BigProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalcountps=0;
		for(int n=1000;n>=1;n--)
		{
			int countsq=0;
			for(int i=1;i<n;i++)
			{
				if(n==i*i)
				{
				countsq++;
				}}
				
	if(countsq==1)
	{
				
					System.out.println(n);
					totalcountps++;
	}}
		System.out.println("count of perfect square numbers is:" +totalcountps);
		int countPrime=0;
		for(int j=1;j<=totalcountps;j++)
		{
			if(totalcountps%j==0)
			{
				countPrime++;
			}
		}
			if(countPrime==2)
			{
				System.out.println(totalcountps+ "is a prime number");
			}
			else
			{
				System.out.println(totalcountps+  "is not a prime number");
			}
			int sopf=0;
			for(int k=1;k<totalcountps;k++)
			{
			if(totalcountps%k==0)
			{
				sopf=sopf+k;
			}
			}
			if(sopf==totalcountps)
			{
				System.out.println(totalcountps+ "is a perfect number");
			}
			else
			{
				System.out.println(totalcountps+ "is not a perfect number");
			}
					
				}}

		
	
		
		

	



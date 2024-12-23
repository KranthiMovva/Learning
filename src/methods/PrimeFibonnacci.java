package methods;

public class PrimeFibonnacci {

	public static void main(String[] args) {
		//int y=37;
		primefib(37);
	}
	
		public static int primefib(int y)
		{
		int cop=0;
for(int i=1;i<=50;i++)
{
	int count=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		cop++;
		if(cop==12)
		{
		
		System.out.println(i);
		
		int a=0;
		int b=1;
		int sum=0;
		
		
		for(int k=1;k<=50;k++)
		{
			
			sum=a+b;
			a=b;
			b=sum;	
		}
		if(sum==i)
		{
			System.out.println("its a fibonacci number");
		}
		else
		{
		
System.out.println("its not a fibonacci number");

		}
		return y;
		}}}}}



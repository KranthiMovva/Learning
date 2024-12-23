package javaclass;

public class SumPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int sum=0;//sum of perfect numbers from 1 to 1000
for(int n=1;n<1000;n++)
{
	int sopf=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sopf=sopf+i;
		}
	}
	if(sopf==n)
	{
		sum=sum+n;
	}
}
		System.out.println(sum);*/
		
		int count=0;//sum of perfect numbers from 1 to 1000
		for(int n=1;n<1000;n++)
		{
			int sopf=0;
			//int count=0;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sopf=sopf+i;
				}
			}
			if(sopf==n)
			{
				count++;
			
			
			if(count==2)
			{
			
		
	
				System.out.println(n);
	}
		}}}}
	



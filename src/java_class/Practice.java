package java_class;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int sum=0;
for(int i=1;i<=100;i++)
{
	if(i%3==0&&i%5==0)
	{
		//int sum=0;
		sum=sum+i;
		//System.out.println(i);
	}}
		System.out.println(sum);*/
		
		//quotient of an equation without using /operator
		
		/*int divisor=5;
		int dividend=18;
		
		int count=0;
		while(dividend>=divisor)
		{
			dividend=dividend-divisor;
			count++;
		}
		System.out.println(count);*/
		
	/*	int n=1264;
		int count=0;
		while(n>0)
		{
			int d=n%10;
			if(d%2!=0)
			{
				count++;
				
			}
			n=n/10;
		}
		System.out.println(count);*/
		
		for(int i=123;i<=135;i++)
		{
			int temp=i;
			int sod=0;
			while(temp>0)
			{
				int d=temp%10;
				sod=sod+d;
				temp=temp/10;
			}
			System.out.println(i+ "=" +sod);
	}
			}
}
		
	

	



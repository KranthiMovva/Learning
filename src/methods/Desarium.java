package methods;

public class Desarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(desarium(135)==true)
		{
			System.out.println("desarium number");
		}
		else
		{
			System.out.println("not desarium number");
		}
	}
public static int count(int n)
{
	int c=0;
	while(n>0)
	{
		n=n/10;
		c++;
	}
	return c;
}
public static boolean desarium(int temp)
{
	int n=temp;
	while(temp>0)
	{
		int sum=0;
	
		int prod=1;
		int d=temp%10;
		public static int power(int d,int c)
		{
		for(int i=1;i<=c;i++)
		{
       prod=prod*d;
		}
       sum=sum+prod;
       temp=temp/10;
       
	}
		return sum==n;
}
	}

}

package javaclass;

public class SumSpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
			{
			
				System.out.println(sum);
			}
			}}}}

	



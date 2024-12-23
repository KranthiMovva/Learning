package javaclass;

public class SpyEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			if(i%2==0)
			
				{
			System.out.println(i);	
	}}

		}}
}
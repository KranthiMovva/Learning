package javaclass;

public class Spy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int count=0;
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
				count++;
			if(count<=5)
			
				{
			System.out.println(i);	
	}}

		}}

	

}*/
		int count=0;
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
				count++;
			if(count==5)
			
				{
			System.out.println(i);	
	}}

		}}

	

}

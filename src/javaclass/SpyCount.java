package javaclass;

public class SpyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=1000;i++)
		{
			int temp=i;
			int sod=0;
			int pod=1;
			//int count=0;
			while(temp>0)
			{
				int rem=temp%10;
				sod=sod+rem;
				pod=pod*rem;
				temp=temp/10;
			}

			if(sod==pod)
			{
				
			count++;
		
			}
			}
				System.out.println(count);
			}
			}

	



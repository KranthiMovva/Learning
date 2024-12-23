package javaclass;

public class ForWhileSOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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



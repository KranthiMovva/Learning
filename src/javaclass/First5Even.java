package javaclass;

public class First5Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			if(count<=5) {
				System.out.println(i);
			}
		}

	}
	}
}

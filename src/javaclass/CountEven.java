package javaclass;

public class CountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				count=count+1;
				System.out.println(i);//if the number is divided by 2 and gives the remainder o then count will be increased by 1
			}
		}
System.out.println(count);
	}

}

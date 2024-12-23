package javaclass;

public class ProductOffOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prod=1;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				prod=prod*i;
				System.out.println(prod);
			}
		}
	}

}

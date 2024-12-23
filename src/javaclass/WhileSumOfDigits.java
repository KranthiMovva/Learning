package javaclass;

public class WhileSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123;
		int sod=0;
		while(n>0)
		{
			int d=n%10;
			sod=sod+d;
			n=n/10;
		}
		System.out.println(n+ "="+sod);
	}

}

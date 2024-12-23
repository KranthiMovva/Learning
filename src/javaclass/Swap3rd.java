package javaclass;

public class Swap3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println("a is :" +a);
		System.out.println("b is :" +b);
		
		int k=a;
		a=b;
		b=k;
		System.out.println("after swapping");
		System.out.println("a is :" +a);
		System.out.println("b is :" +b);

	}

}

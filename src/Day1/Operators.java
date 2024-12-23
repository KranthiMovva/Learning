package Day1;

public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//arithmetic
		System.out.println("----------Arithmetic Operators----------");
		System.out.println("sum of a and b is:" +(a+b));
		System.out.println("diff of a and b is:" +(b-a));
		System.out.println("mul of a and b is:" +(a*b));
		System.out.println("div of a and b is:" +(a/b));
		System.out.println("mod div of a and b is:" +(a%b));
		
		//Relational operators(comparison operators)
		System.out.println("------------Relational Operators---------------" );
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		//Logical Operators works between two boolean values
		
		boolean x=true;
		boolean y=false;
		System.out.println("-----------Logical Operators------------");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		//Increment/decrement operators
		
		a=10;
		a++;   //a=a+1;
		
		System.out.println("------------Increment/decrement operators");
		
		System.out.println(a);
		
		b=20;
		b--;  //b=b-1;
		System.out.println(b);
		
		

	}

}

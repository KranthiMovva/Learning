package javaclass;
import java.util.Scanner;
public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int b1=5;
		int b2=3;
		
		System.out.println(b1<b2);*/
		
		/*boolean b1=true;
		boolean b2=false;
		System.out.println(b1==b2);*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character value");
		char c=scan.next().charAt(0);
		System.out.println(c>='a'&& c<='z');

	}

}

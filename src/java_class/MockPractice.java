package java_class;
import java.util.Scanner;
public class MockPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scan.next().charAt(0);
		System.out.println((ch>65&&ch<=90)||(ch>90&&ch<=122));

	}

}

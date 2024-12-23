package javaclass;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=563;
		int rev=0;
		int temp=n;
		while(temp>0)
		{
			int d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
if(rev==n)
{
	System.out.println(n+ "is a palindrome number");
}
else
{
	System.out.println(n+ "is not a palindrome number");
}
	}

}

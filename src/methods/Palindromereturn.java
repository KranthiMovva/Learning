package methods;

public class Palindromereturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
palindrome(696);
	}
		public static int palindrome(int n)
		{
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
				System.out.println("it is a palindrome number");
			}
			else
			{
				System.out.println("it is not a palindrome number");
			}
			return n;
			}
		}



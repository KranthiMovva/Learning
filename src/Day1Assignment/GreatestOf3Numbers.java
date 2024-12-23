package Day1Assignment;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		
		int a=0;
		int b=30;
		int c=100;
		
		if(a>b&&a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
	}

}

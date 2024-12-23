package mock_1;

public class PatternMock {

	public static void main(String[] args) {
	pattern();
	}
		
		public static void pattern() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("*"+ " ");
				}
				else if(i==3&&j==2||i==3&&j==3||i==3&&j==4)
				{
					System.out.print("$"+ " ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
		
		System.out.println(" ");

		}

}}

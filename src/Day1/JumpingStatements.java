package Day1;

public class JumpingStatements {

	public static void main(String[] args) {
		//break command
	/*	for(int i=1;i<=10;i++)
		{
			if(i==12)
			{
				break;
			}
			System.out.println(i);
		}*/
		
		//use continue to skip a number or something
		
		for(int i=1;i<=10;i++)
		{
			if(i==2 || i==6 ||i==9)                          // to skip one number if(i==8)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}

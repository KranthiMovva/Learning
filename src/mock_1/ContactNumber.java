package mock_1;

public class ContactNumber {

	public static void main(String[] args) {
		long n=9505484743l;
		long soe=0;
		long soodd=0;
		long temp=n;
		long d=temp%10;
		if(d%2==0)
			
		{
			soe=soe+d;
		}
			if(d%2!=0)
			{
				System.out.println(soe);
			
			}
				soodd=soodd+d;
				
			
			temp=temp/10;

		//	System.out.println(soe);
		
			

			System.out.println(soodd);
			}
		

	}



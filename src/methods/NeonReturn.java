package methods;

public class NeonReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		neon(9);
	}
		public static int neon(int n)
		{
			int sq=n*n;
			int sod=0;
			while(sq>0)
			{
				int d=sq%10;
				sod=sod+d;
				sq=sq/10;
			}
			if(sod==n)
			{
				System.out.println("it is a neon number");
			}
			else
			{
				System.out.println("it is not a neon number");
			}
			return n;
			}
		
	}



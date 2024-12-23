package patterns;

public class PatternsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int n=1;
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=4;j++)
	{
		if(i==1&&j==1)
		{
			System.out.print(n +" ");
		}
		else
		{
		n=n+=2;
		System.out.print(n +" ");
	}}
	System.out.println();*/
	/*char ch='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
					System.out.print(ch +" ");
					ch+=2;
				
			if(ch>'y')
			{
				ch='a';
			}
				
				//System.out.print(ch);
			}
			

		System.out.println();*/
		/*int n=2;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
					System.out.print(n +" ");
					n+=2;
				
			if(n>8)
			{
				n=2;;
			}
				
				//System.out.print(ch);
			}
			

		System.out.println();*/
		/*int n=9;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
					System.out.print(n +" ");
					n--;
				
			if(n<1)
			{
				n=9;;
			}
				
				//System.out.print(ch);
			}
			

		System.out.println();*/
		/*int n=8;
		char ch='H';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
		if(i==1 || i==2)
		{
		System.out.print(ch-- +" ");
	}
		else
		{
			System.out.print(n-- +" ");
		}}
			
		System.out.println();*/
		/*char ch='a';
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
		if(j%2!=0)
		{
		System.out.print(ch++ +" ");
	}
		else
		{
			System.out.print(n++ +" ");*/
		//int n=4;
		/*char ch='A';
		for(int i=1;i<=4;i++)
		{
			int n=4;
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==2)
				{
					System.out.print(n +" ");
					n--;
				}
				else
				{
					System.out.print(ch +" ");
				}
			}
			
			if(i>2)
		
			{
			ch++;
			}
		System.out.println();*/
		/*int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==4 || j==1 ||j==4)
				{
					System.out.print(n +" ");
				n++;
				
				if(n>9)
				{
					n=1;
				}}
				else
				{
					System.out.print(" " +" ");
				}}
				System.out.println();*/
		/*int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 ||j==5 ||i==3)
				{
					System.out.print(n +" ");
				n++;
				
				if(n>9)
				{
					n=1;
				}}
				else
				{
					System.out.print(" " +" ");
				}}
				System.out.println();*/
		for(int i=1;i<=4;i++)
		{
			int n=4;
		
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==4 || j==1 ||j==4)
				{
					System.out.print(n +" ");
				n--;
				}
				else
				{
					System.out.print(" " +" ");
				}}
				System.out.println();
		
}
}}
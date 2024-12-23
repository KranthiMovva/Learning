package patterns;

public class printingStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println("*");
			}
			System.out.println(" ");*/
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==1&&j==1)||(i==1&&j==5)||(i==5&&j==1)||(i==5&&j==5))
				{
					
				System.out.print("@"+" ");
		}
				else if(i==3&&j==3)
				{
					System.out.print("$"+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
		System.out.println();*/
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if((i==3)||(i==4))
				{
					
				System.out.print("$");
				}
				else
				{
					System.out.print("*");
				
				}
			}
		System.out.println();*/
/*int n=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
					
				System.out.print(n++ +" ");
				
			}
		System.out.println();*/
		/* char ch='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
					
				System.out.print(ch++ +" ");
				
			}
		System.out.println();*/
		
		/* int n=1;
		 int n1=1;
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
				{
						if((i==1)||(i==2))
						{
					
						
					System.out.print(n++ +" ");
						}
						else if(i==3&&j==1)
						{
							System.out.print(n++ +" ");
						}
						else
						{
							System.out.print(n1++ +" ");
						}
				}
			System.out.println();*/
		/*int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1&&j==1) {
					System.out.print(n +" ");
				}
				else
				{
					n+=2;
				System.out.print(n+ " ");
				}
		}
			System.out.println();*/
		
		/*char ch='a';
		char ch1='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1&&j==1) {
					System.out.print(ch +" ");
				}
				else if(i==4&&j==2)
				{
					
					System.out.print(ch1 +" ");
				}
				else if(i==4&&j==3)
				{
					ch1+=2;
					System.out.print(ch1 +" ");
				}
				else if(i==4&&j==4)
				{
					ch1+=2;
					System.out.print(ch1 +" ");
				}
				else
				{
					ch+=2;
				System.out.print(ch +" ");
				
		}}
			System.out.println();*/
		/*int n=0;
		int n1=0;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				
		if((i==1)||(i==2&&j==1))
		{
			n+=2;
			System.out.print(n +" ");
		}
		else if(i==3&&j==3)
		{
			System.out.print(2);
		}
		else
		{
			n1+=2;
		System.out.print(n1 +" ");
			}
		}
		System.out.println();*/
	/*	int n=9;
		int n1=9;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				
		if((i==1 || i==2))
		{
			System.out.print(n-- +" ");
		}
		else if(i==3&&j==1)
		{
		
		System.out.print(n-- +" ");
			}
		else
		{
			System.out.print(n1-- +" ");
		}
			}
	
			System.out.println();*/
		
		/*char ch='H';
		int n=8;
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
		char ch1='A';
		char ch2='B';
		int n1=1;
		int n2=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==1)
				{
					ch1+=2;
					System.out.print(ch1 +" ");
					
				}
				else if(j==2)
				{
					n1+=2;
					System.out.print(n1 +" ");
					
				}
				else if(j==3)
				{
					ch2+=2;
					System.out.print(ch2 +" ");
				
					
				}
				else
				{
					n2+=2;
					
					System.out.print(n2 +" ");
				}
			}
			System.out.println();
		}}}
	
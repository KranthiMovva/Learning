package patterns;

public class StarSat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int star=1;
for(int i=1;i<=5;i++)
{
	for(int a=1;a<=star;a++)
	{
		
			System.out.print("*"+" ");
		}
	if(i<=2)
	{
		star++;
	}
	else
	{
		star--;
	}	
		System.out.println();*/
		
		/*int rows=7;
		int star=1;
		int space=rows/2;
		for(int i=1;i<=rows;i++)
		{
			for(int a=1;a<=space;a++)
			{
					System.out.print(" "+" ");
				}
			for(int b=1;b<=star;b++)
			{
				System.out.print("*"+" ");
			}
			if(i<=rows/2)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			
			
		}
				System.out.println();*/
		
		/*int star=1;
		int rows=4;
				int space=rows-1;
		for(int i=1;i<=rows;i++)
		{
			for(int a=1;a<=space;a++)
			{
					System.out.print(" "+" ");
				}
			for(int b=1;b<=star;b++)
			{
				System.out.print("*" +" ");
			}
			if(i<=rows/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space--;
				star+=2;
			}
			
		System.out.println();*/
		int rows=4;
		int star=rows*2-1;;
		//int rows=4;
				int space=0;
		for(int i=1;i<=rows;i++)
		{
			for(int a=1;a<=space;a++)
			{
					System.out.print(" "+" ");
				}
			for(int b=1;b<=star;b++)
			{
				System.out.print("*" +" ");
			}
			if(i<=rows/2)
			{
				space++;
				star-=2;
			}
			else
			{
				space++;
				star-=2;
			}
			
		System.out.println();
	}
}
}



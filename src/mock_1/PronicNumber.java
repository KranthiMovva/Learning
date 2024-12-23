package mock_1;
//import java.util.Scanner;
public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner Scan=new Scanner(System.in);
		//System.out.println("Enter the lower limit");
//int a=Scan.nextInt();
//System.out.println("enter the higher limit");
//int b=Scan.nextInt();
	
boolean pronic=false;
		for(int i=1;i<=1000;i++)
		{
			int num=i;
			for(int j=0;j<=num;j++)
			{
			if(j*(j+1)==num)
			{
				pronic=true;
			}
			}
			if(pronic==true)
			{
				System.out.println(i);
				pronic=false;
			}
		
		}}}
	



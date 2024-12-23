package javaclass;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();

int temp1=n;
int temp2=0;
int count=0;
while(temp1>0)
{
	temp1/=10;
	count++;
}
if(count%2==0)
{
	

for(int i=0;i<=count;i++)
{

	int d=n%10;
if(i>count/2)
{
	temp2=temp2*10+d;
}
	
temp2=temp2/10;
}
while(temp2>0)
{
	int d=temp2%10;
	System.out.println(d);
	temp2/=10;
}

}
else
{
	System.out.println("enter even digits count number");
}
}}
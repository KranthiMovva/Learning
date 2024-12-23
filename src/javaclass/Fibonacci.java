package javaclass;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int sum=0;
int count=0;

for(int i=1;i<=8;i++)
{

	sum=a+b;
	
	a=b;
	b=sum;
}
int m=b;
int n=a;
int sub=0;
System.out.print(m);
System.out.print(n);
for(int k=1;k<=8;k++)
{
	sub=m-n;
	System.out.print(sub);
	m=n;
	n=sub;
}
for(int j=1;j<=sub;j++)
{

if(sub%j==0)
{
	
	count++;

if(count==2)
{
	System.out.print(sub);

	}
}
}}}
	
	


	



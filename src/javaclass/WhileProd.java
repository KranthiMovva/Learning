package javaclass;

public class WhileProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=133;
int temp=n;
int pod=1;
while(temp>0)
{
	int d=temp%10;
	pod=pod*d;
	temp=temp/10;
}
System.out.println(n+ "=" +pod);
}
	}




package javaclass;

public class WhileCountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1273;
int temp=n;
int count=0;
while(temp>0)
{
	int d=temp%10;
	count++;
	temp=temp/10;
}
System.out.println(n+ "=" +count);
	}

}

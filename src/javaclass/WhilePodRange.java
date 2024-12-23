package javaclass;

public class WhilePodRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=135;i<=143;i++)
		{
		int temp=i;
		int pod=1;
		while(temp>0)
		{
			int d=temp%10;
			pod=pod*d;
			temp=temp/10;
		}
		System.out.println(i+ "=" +pod);
		}
		

	}

}

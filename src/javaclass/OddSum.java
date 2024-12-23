package javaclass;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=123;i<=129;i++){
			{
				int sum=0;
				int temp=i;
				while(temp>0)
				{
					int d=temp%10;
					sum=sum+d;
					temp=temp/10;
				}
				System.out.println(sum);
			}
		}
	}
}
			
		
	



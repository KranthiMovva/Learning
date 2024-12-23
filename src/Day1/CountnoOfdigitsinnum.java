package Day1;

public class CountnoOfdigitsinnum {

	public static void main(String[] args) {
	
		int num=654;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}

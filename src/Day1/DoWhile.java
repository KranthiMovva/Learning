package Day1;

public class DoWhile {

	public static void main(String[] args) {
		
		//print 1 to 10 numbers using do while loop
		
		int i=1;
		
		do
		{//diff between while and do while is in while it first check the expression and enter the loop in do while first it will enter the loop and then checks expression in do while the loop is executed atleast once
			System.out.println(i);
			i++;
		}while(i<=10);

	}

}

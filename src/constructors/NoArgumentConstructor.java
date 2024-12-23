package constructors;

public class NoArgumentConstructor {
	int i=10;
	int j=20;
	public NoArgumentConstructor() {
		super();
		System.out.println("hi");
	}
/*class Developer{
public Developer() {
	super();
	System.out.println("hello");
	
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("wow");
NoArgumentConstructor obj=new NoArgumentConstructor();
//Developer obj1=new Developer();
System.out.println(obj.i);

	}

}

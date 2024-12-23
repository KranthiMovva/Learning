package constructors;

public class ParameterisedConstructor {
int i;
int j;
public ParameterisedConstructor(int i,int j) {
	this.i=i;
	this.j=j;
	System.out.println("hello world");
}

/*class User
{
	public User() {
		System.out.println("cutie");
	}*/
	public static void main(String[] args) {
		System.out.println("hello");
		ParameterisedConstructor obj=new ParameterisedConstructor(10,20);
		System.out.println(obj.i);
		System.out.println(obj.j);
	//	User obj1=new User();
	}

}

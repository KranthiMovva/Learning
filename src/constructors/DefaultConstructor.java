package constructors;

public class DefaultConstructor {
	
	int i;
	int j;
	public DefaultConstructor()
	{
	System.out.println(this.i);
	System.out.println(this.j);
	}
/*class User{
	public User()
	{
	
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructor obj=new DefaultConstructor();
		//User obj1=new User();
		System.out.println(obj.i);
		System.out.println(obj.j);
	}

}

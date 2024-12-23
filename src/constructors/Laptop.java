package constructors;

public class Laptop {
	String name;
	int price;
	double version;
	char b;

	public Laptop(String name)
	{
		this.name=name;
		//System.out.println(this.name);
	}
	public Laptop(int price)
	{
		this.price=price;
		System.out.println(this.price);
	}
public Laptop(double version)
{
	this.version=version;
	System.out.println(this.version);
}
public Laptop(char b)
{
	this.b=b;
	//System.out.println(this.b);
}
	public static void main(String[] args) {
		
Laptop obj=new Laptop("dell");
System.out.println(obj.name);
Laptop obj1=new Laptop("dell");
System.out.println(obj1.price);

//Laptop obj1=new Laptop(45000);
//Laptop obj2=new Laptop(4.6);
//Laptop obj3=new Laptop('b');
	}

}

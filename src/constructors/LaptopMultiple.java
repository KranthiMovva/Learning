package constructors;

public class LaptopMultiple {
String bN;
String version;
int price;
String color;
String storage;

public LaptopMultiple(String bN) {
	this.bN=bN;
	System.out.println(this.bN);
	System.out.println("from one-argumented constructor");
}
public LaptopMultiple(String bN,String version) {
	this.bN=bN;
	this.version=version;
	System.out.println(this.bN);
	System.out.println(this.version);
	System.out.println("from two-argumented constructor");
}
public LaptopMultiple(String bN,String version,int price) {
	this.bN=bN;
	this.version=version;
	this.price=price;
	System.out.println(this.bN);
	System.out.println(this.version);
	System.out.println(this.price);
	System.out.println("from three-argumented constructor");
}
public LaptopMultiple(String bN,String version,int price,String color) {
	this.bN=bN;
	this.version=version;
	this.price=price;
	this.color=color;
	System.out.println(this.bN);
	System.out.println(this.version);
	System.out.println(this.price);
	System.out.println(this.color);
	System.out.println("from four-argumented constructor");
}
public LaptopMultiple(String bN,String version,int price,String color,String storage) {
	this.bN=bN;
	this.version=version;
	this.price=price;
	this.color=color;
	this.storage=storage;
	System.out.println(this.bN);
	System.out.println(this.version);
	System.out.println(this.price);
	System.out.println(this.color);
	System.out.println(this.storage);
	System.out.println("from five-argumented constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LaptopMultiple 11=new LaptopMultiple();
		LaptopMultiple a=new LaptopMultiple("vivo-book");
		LaptopMultiple b=new LaptopMultiple("hp","12v");
		LaptopMultiple c=new LaptopMultiple("dell","11v",35000);
		LaptopMultiple d=new LaptopMultiple("lenovo","13v",45000,"black");
		LaptopMultiple e=new LaptopMultiple("asus","14v",54000,"grey","5tb");
	}

}

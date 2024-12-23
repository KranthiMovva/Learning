package inheritance;

public class Bike extends Vehicle {
	String bN="FZ";
	int tS=180;
	double price=120000;
	
	public void show() {
		System.out.println(this.bN+" "+this.tS+" "+this.price);
	}

}

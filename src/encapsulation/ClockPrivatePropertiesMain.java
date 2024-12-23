package encapsulation;

public class ClockPrivatePropertiesMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockPrivateProperties obj=new ClockPrivateProperties(9,30,45);
		System.out.println(obj.getHr());
		obj.setHr(11);
		System.out.println(obj.getHr());
	}

}

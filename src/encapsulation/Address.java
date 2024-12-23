package encapsulation;

public class Address {
	
	int dNo;
	String street;
	String town;
	
	public Address(int dNo,String street,String town) {
		
		this.dNo=dNo;
		this.street=street;
		this.town=town;
	}
	public void recognition() {
		System.out.println("Address found");
	}

}

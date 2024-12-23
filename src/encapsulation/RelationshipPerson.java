package encapsulation;

public class RelationshipPerson {

	String name;
	long phNo;
	Address address;
	
	public RelationshipPerson(String name,long phNo,Address address) {
		this.name=name;
		this.phNo=phNo;
		this.address=address;
	}
public void work() {
	System.out.println("Automation Test Engineer");
}
}

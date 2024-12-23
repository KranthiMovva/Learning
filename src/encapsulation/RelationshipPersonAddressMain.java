package encapsulation;

public class RelationshipPersonAddressMain {

	public static void main(String[] args) {
		RelationshipPerson p=new RelationshipPerson("kranthi",9505484743l,new Address(24,"Gandhi Nagar","kphb"));
p.work();
p.address.recognition();
System.out.println(p.phNo);
System.out.println(p.address.town);
	}

}

package inheritance;

public class GameLudoMain {

	public static void main(String[] args) {
		Ludo l=new Ludo("ludo","Cricket",4,1,6);
System.out.println(l.name1);
System.out.println(l.name2);
System.out.println(l.dice);
System.out.println(l.people);
System.out.println(l.king);
System.out.println(l);
System.out.println(l.toString());
System.out.println(l.hashCode());
	}

}

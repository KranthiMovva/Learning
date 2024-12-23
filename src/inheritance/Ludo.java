package inheritance;

public class Ludo extends Game{

	int dice;
	 int king ;
	int people;
	
	public Ludo(String name1,String name2,int dice,int king,int people) {
		super(name1,name2);
	this.dice=dice;
	this.king=king;
	this.people=people;
	}
}

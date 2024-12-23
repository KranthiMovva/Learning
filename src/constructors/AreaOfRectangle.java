package constructors;

public class AreaOfRectangle {
	
	int l;
	int b;
	public AreaOfRectangle(int l,int b) {
		this.l=l;
		this.b=b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle r=new AreaOfRectangle(10,20);
		System.out.println(r.l*r.b);
	}

}

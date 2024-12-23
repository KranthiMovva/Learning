package encapsulation;

public class ClockPrivateProperties {
	
	private int hr;
	private int min;
	private int sec;
	
	public ClockPrivateProperties(int hr,int min,int sec) {
		if(hr>=1&&hr<=12&&min>=1&&min<=60&&sec>=1&&sec<=60)
		{
			this.hr=hr;
			this.min=min;
			this.sec=sec;
		}
		else
		{
			System.out.println("invalid time");
		}
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		if(hr>=1&&hr<=12) {
			this.hr=hr;
		}
		else
		{
			System.out.println("invalid time");
		}}
		public int getMin() {
			return min;
		}
		public void setMin(int min) {
			if(min>=1&&min<=12) {
				this.min=min;
			}
			else
			{
				System.out.println("invalid time");
			}}
			public int getSec() {
				return sec;
			}
			public void setSec(int sec) {
				if(sec>=1&&sec<=12) {
					this.sec=sec;
				}
				else
				{
					System.out.println("invalid time");
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

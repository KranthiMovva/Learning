package encapsulation;

public class EmployeePrivateSalary {
	 String name;
	 int id;
	private int salary;
	
	public EmployeePrivateSalary(String name,int id,int salary) {
		
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		
			this.salary=salary;
	}}
		
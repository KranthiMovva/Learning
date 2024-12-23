package encapsulation;

public class EmployeePrivateSalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeePrivateSalary obj=new EmployeePrivateSalary("kranthi",2368943,49650);
		System.out.println(obj.getSalary());
		obj.setSalary(58340);
		System.out.println(obj.getSalary());
	}

}

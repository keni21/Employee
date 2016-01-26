package Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee Mitarbeiter1=new Employee(1, "mit1", 3000, "IT");
		Employee Mitarbeiter2=new Employee(2, "mit2", 2000, "IT");
		Employee Mitarbeiter3=new Employee(3, "mit3", 2000, "Server");
		Employee Mitarbeiter4=new Employee(4, "mit4", 2000, "Server");
		Employee Mitarbeiter5=new Employee(5, "mit5", 2000, "PDE");
		Employee Mitarbeiter6=new Employee(6, "mit6", 2000, "PDE");
		
		EmployeeManager Manger=new EmployeeManager();
		
		Manger.addEmployee(Mitarbeiter1);
		Manger.addEmployee(Mitarbeiter2);
		Manger.addEmployee(Mitarbeiter3);
		Manger.addEmployee(Mitarbeiter4);
		Manger.addEmployee(Mitarbeiter5);
		Manger.addEmployee(Mitarbeiter6);
		
		
		Manger.print();
		System.out.println("-----------------------------------");
		System.out.println(Manger.findByEmpNumber(3));
		System.out.println("-----------------------------------");
		System.out.println(Manger.findByDepartment("IT"));
		System.out.println("-----------------------------------");
		System.out.println(Manger.findbyMaxSalary());

	}

}

package Employee;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> employees=new ArrayList<Employee>();
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	
	public void print()
	{
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}
	
	public Employee findbyMaxSalary()
	{
		Employee Maxsalary=null;
		double salary=0.0;
		
		for (Employee employee : employees) {
			if(employee.getSalary() > salary)
			{
				salary=employee.getSalary();
				Maxsalary=employee;
			}
		}
		return Maxsalary;
	}
	
	public Employee findByEmpNumber(int number)
	{
		Employee EmpNumber=null;
		
		for (Employee employee : employees) {
			if(employee.getEmpNumber()==number)
			{
				EmpNumber=employee;
			}
		}
		return EmpNumber;
	}
	
	public ArrayList<Employee> findByDepartment(String department)
	{
		ArrayList<Employee>Department=new ArrayList<Employee>();
		
		for (Employee employee : employees) {
			if(employee.getDepartment().equals(department))
			{
				Department.add(employee);
			}
		}
		return Department;
	}
}

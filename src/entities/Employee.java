package entities;

public class Employee {

	private String nameEmployee;
	private double salaryEmployee;

	
	
	
	public Employee() {
		
	}
	
	public Employee(String nameEmployee, double salaryEmployee) {
		this.nameEmployee = nameEmployee;
		this.salaryEmployee = salaryEmployee;
	}
	
	
	public String getNameEmployee() {
		return nameEmployee;
	}


	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}


	public double getsalaryEmployee() {
		return salaryEmployee;
	}


	public void setsalaryEmployee(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}
	
	
}

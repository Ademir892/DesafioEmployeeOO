package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	private String email;
	private String phone;
	


	public Department() {
		
	}

	public Department(String name, int payDay, String email, String phone) {
		this.name = name;
		this.payDay = payDay;
		this.email = email;
		this.phone = phone;
	}

	List<Employee> emp = new ArrayList<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	
	public void addEmployee(Employee employee) {
		emp.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		emp.remove(employee);
	}
	
	public double payRoll() {
		double totalSalary = 0;
		for(Employee employee : emp) {
			totalSalary += employee.getsalaryEmployee();
		}
		return totalSalary;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento de" + name + "= R$ " + payRoll() + "\n");
		sb.append("Pagamento reaizado no dia" + payDay + "\n");
		sb.append("Funcionarios: \n");
		for(Employee employee : emp) {
			sb.append(employee.getNameEmployee() + "\n");
		}
		sb.append("Para duvidas favor entrar em contato: " + email);
		return sb.toString();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String name = sc.next();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();
		Department dept = new Department(name, payDay, email, phone);
		
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados do funcionario " + i + ":");
			System.out.print("Nome: ");
			String nameEmployee = sc.next();
			System.out.print("Salario: ");
			double salaryEmployee = sc.nextDouble();
			Employee employee = new Employee(nameEmployee, salaryEmployee);
			dept.addEmployee(employee);
		}

		
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println(dept);
		
		showReport(dept);
		sc.close();

	}

	private static void showReport(Department dept) { 
	}
	
}

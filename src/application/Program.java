package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name=sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary=sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax=sc.nextDouble();
		System.out.println();
		System.out.println(employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage=sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.printf("Updated data: "+ employee.name+" , $ "+ employee.increaseSalary(percentage));
		sc.close();

	}

}

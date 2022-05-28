package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee01 = new Employee();
		
		System.out.println("Enter the employee's name:");
		employee01.name = sc.nextLine();
		System.out.println("Enter the gross salary:");
		employee01.grossSalary = sc.nextDouble();
		System.out.println("Enter the employee's tax:");
		employee01.tax = sc.nextDouble();
		System.out.println(employee01);
		
		System.out.println("Enter the percentage to increase salary:");
		employee01.increaseSalary(sc.nextDouble());
		System.out.println(employee01);
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

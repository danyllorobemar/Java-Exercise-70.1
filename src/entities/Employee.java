package entities;

public class Employee {

	public String name;
	public double tax;
	public double grossSalary;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void showEmployeeData() {
		System.out.println("----------------------------");
		System.out.println("Name: " + name);
		System.out.println("Net Salary: " + netSalary() );
	}
	
	public String toString() {
		return "\n-------------------\nName: " + name + "\nNet salary: " 
	            + String.format("%.2f" ,netSalary());
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
	
	
	
	
	

}

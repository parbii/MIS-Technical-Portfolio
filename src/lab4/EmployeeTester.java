package lab4;
import java.util.Scanner; // Crucial to avoid red "X" [cite: 33]

// Lab #4
// Purpose: Tiered Payroll & Regulatory Compliance Engine
// Author: Mario Jones II
// Date: March 20, 2026

public class EmployeeTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee emp = new Employee();
		
		// 1. Input Data [cite: 36]
		System.out.print("Enter number of hours worked: ");
		emp.hoursWorked = in.nextDouble();
		System.out.print("Enter hourly rate: ");
		emp.hourlyRate = in.nextDouble(); 
		
		// 2. Process Calculations [cite: 38] 
		double gross = emp.computeGrossSalary(); 
		double taxes = emp.computeTaxes(gross);
		double netSalary = gross - taxes; // [cite: 45]
				
		// 3. Output Result [cite: 37]
		System.out.printf("The net salary is: $%.2f%n", netSalary);
		
		in.close();
	}

}

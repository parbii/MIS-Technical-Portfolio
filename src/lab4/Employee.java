package lab4;

// Lab #4
// Purpose: Tiered Payroll & Regulatory Compliance Engine
// Author: Mario Jones II
// Date: March 20, 2026

public class Employee {
// Attributes
public double hoursWorked;
public double hourlyRate;

// Method to compute Gross Salary with 40-hour minimum rule 
public double computeGrossSalary() {
	if (hoursWorked < 40) {
		hoursWorked = 40; // Rule: paid for 40 hours if you work less [cite: 30, 41] 
	}
	return hoursWorked * hourlyRate;
}

// Method to compute Taxes based on Gross Salary 
public double computeTaxes(double grossSalary) {
	double taxRate = 0;
	if (grossSalary <= 1000) {
		taxRate  = 0.015; // 1.5% for lower salaries [cite: 33, 43]
	} else {
		taxRate = 0.0161; // 1.61% tax for salaries > 1000
	}
	return grossSalary * taxRate;
	}
}

package lab2bis;

public class Employee {
    // 1. Attributes [cite: 65, 66, 67, 68, 71]
    public String firstName;
    public String lastName;
    public double hourlyRate;
    public double numberOfHourWorked;

    // 2. Constructor [cite: 72]
    public Employee() {
        // This allows us to create an instance in the Tester class
    }

    // 3. Logic Methods [cite: 73, 74, 75]
    public double computeGrossSalary() {
        return numberOfHourWorked * hourlyRate;
    }

    public double computeTaxes(double grossSalary) {
        // Tax rate is 1.5% (0.015) 
        return grossSalary * 0.015;
    }

    public double computeNetSalary(double gross, double taxes) {
        // Net salary = gross salary - taxes 
        return gross - taxes;
    }

    // 4. Display Method [cite: 76]
    public void displayNetSalary(double netSalary) {
        System.out.printf("Employee: %s %s%n", firstName, lastName);
        System.out.printf("The net salary is: $%.2f%n", netSalary);
    }
}
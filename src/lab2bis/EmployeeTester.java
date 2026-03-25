package lab2bis;
import java.util.Scanner; // Required for keyboard input 

public class EmployeeTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee emp = new Employee(); // Create 1 instance of Employee [cite: 78]

        // 1. Prompt User for Input [cite: 55, 58]
        System.out.print("Enter first name: ");
        emp.firstName = in.nextLine();
        System.out.print("Enter last name: ");
        emp.lastName = in.nextLine();
        System.out.print("Enter hourly rate: ");
        emp.hourlyRate = in.nextDouble();
        System.out.print("Enter hours worked: ");
        emp.numberOfHourWorked = in.nextDouble();

        // 2. Perform Calculations [cite: 79, 80, 81]
        double gross = emp.computeGrossSalary();
        double taxes = emp.computeTaxes(gross);
        double net = emp.computeNetSalary(gross, taxes);

        // 3. Display Result [cite: 82]
        emp.displayNetSalary(net);

        in.close();
    }
}
package homework2;
import java.util.Scanner;

// Homework 2 
// Purpose: Resource Optimization & Algorithmic Logic
// Author: Mario Jones II
// Date: March 23, 2026

public class SharonGasTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Input Data
        System.out.print("Enter Average Gas Price: ");
        double price = in.nextDouble();
        System.out.print("Enter Average MPG: ");
        double mpg = in.nextDouble();

        // 2. Calculations
        double totalDistance = 360.0; // 180 miles each way
        double gallonsNeeded = totalDistance / mpg;
        double totalCost = gallonsNeeded * price;

        // 3. Output Result (Formatted to 2 decimal places)
        System.out.printf("Gas Cost (Dollar): %.2f%n", totalCost);

        in.close();
    }
}

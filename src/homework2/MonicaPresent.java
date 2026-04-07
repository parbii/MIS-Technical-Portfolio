package homework2;
import java.util.Scanner;

// Homework 2 
// Purpose: Calculate cake packets, costs, and rebates
// Author: Mario Jones II
// Date: April 7, 2026

public class MonicaPresent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Input Data
        System.out.print("Enter Shipping Cost: ");
        double shipping = in.nextDouble();
        System.out.print("Enter Handling Cost: ");
        double handling = in.nextDouble();
        System.out.print("Enter Gas Cost: ");
        double gas = in.nextDouble();
        // Present cost is included in table but doesn't change the decision
        System.out.print("Enter Present Cost: ");
        double present = in.nextDouble();

        // 2. Calculations
        double totalOnline = shipping + handling;
        double totalTravel = gas;

        // 3. Logic & Output
        if (totalOnline <= totalTravel) {
            System.out.println("The best way to buy: Online");
        } else {
            System.out.println("The best way to buy: Travel");
        }

        in.close();
    }
}

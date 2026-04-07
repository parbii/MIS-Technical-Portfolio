package cakeProject; // MUST be the first line to avoid errors
import java.util.Scanner;

// Individual Term Project - Part 2
// Purpose: Calculate cake packets, costs, and rebates
// Author: Mario Jones II
// Date: April 7, 2026

public class CakeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. INPUT DATA [cite: 673]
        System.out.print("Enter the total quantity of cakes to buy: ");
        int totalCakes = in.nextInt();

        // 2. PROCESS: Packet Breakdown [cite: 673]
        // Using integer division and modulus for precise packet counts
        int num100 = totalCakes / 100;
        int remainderAfter100 = totalCakes % 100;
        int num25 = remainderAfter100 / 25;
        int numSingles = remainderAfter100 % 25;

        // 3. PROCESS: Cost Calculations [cite: 664-668]
        double cost100 = num100 * 100 * 1.10; // $1.10 per cake in 100-packet
        double cost25 = num25 * 25 * 1.25;    // $1.25 per cake in 25-packet
        double costSingles = numSingles * 1.50; // $1.50 for single cakes
        double baseCost = cost100 + cost25 + costSingles;

        // 4. PROCESS: Rebate Logic [cite: 669]
        double rebate = 0;
        if (totalCakes > 400) {
            rebate = num100 * 2.00; // $2 rebate per packet of 100
        }

        double finalBill = baseCost - rebate;

        // 5. OUTPUT RESULTS [cite: 671-676]
        System.out.println("\n--- Order Summary ---");
        System.out.println("Packets of 100: " + num100);
        System.out.println("Packets of 25: " + num25);
        System.out.println("Single Cakes: " + numSingles);
        System.out.printf("Base Cost: $%.2f%n", baseCost);
        System.out.printf("Rebate: $%.2f%n", rebate);
        System.out.printf("Final Bill to Pay: $%.2f%n", finalBill);

        in.close();
    }
}
package dailyProblem;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double units = scanner.nextDouble();

        double fixedCharge = 100.0;
        double ratePerUnit = 5.5;
        double totalCost;

        if (units <= 100) {
            totalCost = fixedCharge + (units * ratePerUnit);
        } else if (units <= 300) {
            totalCost = fixedCharge + (100 * ratePerUnit) + ((units - 100) * 6.5);
        } else {
            totalCost = fixedCharge + (100 * ratePerUnit) + (200 * 6.5) + ((units - 300) * 8.0);
        }

        System.out.printf("Total electricity bill: ₹%.2f%n", totalCost);
        scanner.close();
    }
}

package dailyProblem;

import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

       
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Natural numbers up to " + n + ":");
       
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }

        
        scanner.close();
    }
}

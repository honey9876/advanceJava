package dailyProblem;

import java.util.Scanner;

// Accept two integers from user and print the sum


public class integerTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");

        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");

        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("sum of " + num1 + " & " + num2 + "  = " + sum);

          scanner.close();
    }
    
}

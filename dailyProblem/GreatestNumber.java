package dailyProblem;
//12- Accept two numbers and print the greatest between them

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("The greatest number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The greatest number is: " + number2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

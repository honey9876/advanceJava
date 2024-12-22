package dailyProblem;

import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your input (M/m for Male, F/f for Female): ");
        char input = scanner.next().charAt(0);

        // Check the input and provide corresponding output
        if (input == 'M' || input == 'm') {
            System.out.println("Good Morning Sir");
        } else if (input == 'F' || input == 'f') {
            System.out.println("Good Morning Ma'am");
        } else {
            System.out.println("Wrong Input");
        }

        scanner.close();
    }
}

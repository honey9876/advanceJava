package dailyProblem;
import java.util.Scanner;

public class VoterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + ", You are a valid voter.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("Sorry " + name + ", you can't vote.");
            System.out.println("You will be eligible to vote in " + yearsLeft + " year(s).");
        }

        scanner.close();
    }
}

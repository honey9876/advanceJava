package dailyProblem;
//13- Accept the gender from the user as char and print the respective greeting message
// Ex - Good Morning Sir (on the basis of gender)

import java.util.Scanner;

public class GenderGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your gender (M/F): ");
        char gender = input.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("Good Morning Sir");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Good Morning Ma'am");
        } else {
            System.out.println("Invalid Input");
        }
    }
}


package dailyProblem;
//14- Extend the previous program and handle the wrong inputs.
// Print Good Morning sir for input m or M & Good morning Maam for input F or f 
// else print Wrong Input

import java.util.Scanner;

public class ExtendedGenderGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your gender (M/F): ");
        char gender = input.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("Good Morning Sir");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Good Morning Ma'am");
        } else {
            System.out.println("Wrong Input");
        }
    }
}


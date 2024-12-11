package dailyProblem;
import java.util.Scanner;
// Accept the User's name, age and print in following manner 
public class userDetails {
    public static void main(String[] args) {
        
   
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name");
    String name = scanner.nextLine();

    System.out.println("Enter your age");
    int age = scanner.nextInt();

    System.out.println("user`s Name " + name);
    System.out.println("user`s age" + age);

    scanner.close();


    } 
}

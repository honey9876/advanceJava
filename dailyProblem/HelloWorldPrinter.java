package dailyProblem;

import java.util.Scanner;

public class HelloWorldPrinter {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to print 'Hello, World!': ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Hello, World!");
        }

    
        scanner.close();
    }
}

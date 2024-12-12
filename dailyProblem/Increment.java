package dailyProblem;

public class Increment {
    // public static void main(String[] args) {
    //     int x = 5;

    //     int preIncrement = ++x; 
    //     System.out.println("Pre-Increment: " + preIncrement); 
    //     System.out.println("Value of x: " + x); 

    //     int postIncrement = x++; 
    //     System.out.println("Post-Increment: " + postIncrement); 
    //     System.out.println("Value of x: " + x); 
    // }

    public static void main(String[] args) {
        int start = 1, end = 5, sum = 0;

        while (start <= end) {
            sum += start++;
        }

        System.out.println("Sum of consecutive numbers from 1 to 5 is: " + sum);
    }
}

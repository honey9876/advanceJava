package dailyProblem;

// Print the messege along with values and sum
// 	Ex - The sum of 45 & 12  = 57

// public class Print {
//     public static void main(String[] args) {
//         int num1 = 45;
//         int num2 = 12;
//         int sum = num1 + num2;
        
//         System.out.println("The sum of " + num1 + " & " + num2 + " = " + sum);
//     }
    
// }

public class SumExample {
    public static void main(String[] args) {
        printSum(45, 12);
    }

    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " & " + num2 + " = " + sum);
    }
}


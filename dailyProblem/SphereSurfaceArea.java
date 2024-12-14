package dailyProblem;
//Find surface area of sphere......


import java.util.Scanner;

public class SphereSurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("Surface Area of the sphere: " + surfaceArea);

        scanner.close();
    }
}

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a, b, and c respectively: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        if (a == 0) {
            System.out.println("You entered the value 0 for a, a has to be different from zero.");
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant < 0) {
                System.out.println("The equation has no real roots.");
            } else if (discriminant == 0) {
                double r = -b / 2 * a; 
                System.out.println("This equation has only one real root, and it is: r = " + r);
            } else {
                double r1 = (-b + Math.pow(discriminant, 0.5))/ 2 * a; 
                double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a; 
                System.out.println("This equation has two real roots, and they are: r1 = " + r1 + "; r2 = " + r2);
            }
        }
        
    }
}

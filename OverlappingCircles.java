import java.util.Scanner;

public class OverlappingCircles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = keyboard.nextDouble();
        double y1 = keyboard.nextDouble();
        double radius1 = keyboard.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = keyboard.nextDouble();
        double y2 = keyboard.nextDouble();
        double radius2 = keyboard.nextDouble();

        keyboard.close();

        double distanceBetweenCenters = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distanceBetweenCenters <= radius1 - radius2) {
            System.out.println("Circle 2 is inside circle 1.");
        } else if (distanceBetweenCenters <= radius1 + radius2) {
            System.out.println("Circle 2 overlaps with circle 1.");
        } else {
            System.out.println("Circle 2 is outside circle 1.");
        }
    }
}
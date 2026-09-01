import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the center x and y coordinates, width, and height of the first rectangle: ");
        double x1 = keyboard.nextDouble();
        double y1 = keyboard.nextDouble();

        double width1 = keyboard.nextDouble();
        double height1 = keyboard.nextDouble();

        System.out.print("Enter the center x and y coordinates, width, and height of the second rectangle: ");
        double x2 = keyboard.nextDouble();
        double y2 = keyboard.nextDouble();

        double width2 = keyboard.nextDouble();
        double height2 = keyboard.nextDouble();

        keyboard.close();

        if (x2 - width2 / 2 > x1 - width1 / 2 && x2 + width2 / 2 < x1 + width1 / 2 && y2 - height2 / 2 > y1 - height1 / 2 && y2 + height2 / 2 < y1 + height1 / 2) {
            System.out.println("The second rectangle is inside the first rectangle.");
        } else if ((x2 - width2 / 2 < x1 - width1 / 2 && x2 + width2 / 2 > x1 + width1 / 2 && y2 - height2 / 2 < y1 - height1 / 2 && y2 + height2 / 2 > y1 + height1 / 2) || (x2 - width2 / 2 > x1 + width1 / 2) || (x2 + width2 / 2 < x1 - width1 / 2) || (y2 - height2 / 2 > y1 + height1 / 2) || (y2 + height2 / 2 < y1 - height1 / 2)) {
            System.out.println("The second rectangle is outside the first rectangle.");
        } else {
            System.out.println("The second rectangle overlaps the first rectangle.");
        }
    }
}
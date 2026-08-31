import java.util.Scanner;

public class PointsInTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, y;
        System.out.print("Enter x and y: ");
        x = input.nextDouble();
        y = input.nextDouble();
        input.close();

        if (x >= 0 && y >= 0 && y / 100 + x / 200 <= 1) {
            System.out.println("The point is inside the triangle!");
        } else {
            System.out.println("The point is outside the triangle!");
        }
    }
}

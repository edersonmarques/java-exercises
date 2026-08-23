import java.util.Scanner;

public class VolumeOFCylinder {
    public static void main(String[] args) {
        final double PI = 3.1415;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        input.close();

        System.out.println("The volume of this cylinder is: " + (int)((radius * radius * PI * length + 0.05 ) * 10 ) / 10.0);
    }
}

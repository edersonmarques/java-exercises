import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in feet: ");
        double feet = input.nextDouble();
        input.close();

        System.out.println("This number in meters is: " + feet * 0.305);
    }
}

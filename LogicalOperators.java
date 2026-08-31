import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();

        System.out.println("Is it divisible by 4 and 5? " + ((number % 4 == 0) && (number % 5 == 0)));
        System.out.println("Is it divisible by 4 or 5? " + ((number % 4 == 0) || (number % 5 == 0)));
        System.out.println("Is it divisible by 4 or 5 but not both? " + ((number % 4 == 0) ^ (number % 5 == 0)));

    }
}

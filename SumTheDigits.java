import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer between 0 and 1000: ");
        int number = input.nextInt();

        int sumDigits = 0;
        sumDigits += number % 10;
        number /= 10;
        sumDigits += number % 10;
        number /= 10;
        sumDigits += number % 10;
        number /= 10;
        sumDigits += number % 10;
        number /= 10;

        System.out.println("The sum of the digits is: " + sumDigits);
    }
}
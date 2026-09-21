import java.util.Scanner;

public class CountingMonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount (5.79): ");
        double amount = input.nextDouble();
        input.close();

        int remainingCents = (int)(amount * 100); // Imprecision problem
        int dollars = remainingCents / 100;
        remainingCents %= 100;
        int quarters = remainingCents / 25;
        remainingCents %= 25;
        int dimes = remainingCents / 10;
        remainingCents %= 10;
        int nickels = remainingCents / 5;
        remainingCents %= 5;
        int pennies = remainingCents;

        System.out.println("\n\nNumber of dollars: " + dollars);
        System.out.println("Number of quarters: " + quarters);
        System.out.println("Number of dimes: " + dimes);
        System.out.println("Number of nickels: " + nickels);
        System.out.println("Number of pennies: " + pennies);

        
    }
}
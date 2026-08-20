import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // get and store the day now
        Scanner input = new Scanner(System.in);
        System.out.println("Which day is today? Enter a number from 0-6, with 0 representing Sunday: ");
        int day_now = input.nextInt();
        // print the number representing the day 100 days from now
        final String[] days_of_week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("100 days from now, it will be a: " + days_of_week[(day_now + 100) % 7]);

    }
}
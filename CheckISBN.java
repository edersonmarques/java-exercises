import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        int isbn = input.nextInt();
        input.close();

        int d9 = isbn % 10;
        int remainingDigits = isbn / 10;
        int d8 = remainingDigits % 10;
        remainingDigits /= 10;
        int d7 = remainingDigits % 10;
        remainingDigits /= 10;
        int d6 = remainingDigits % 10;
        remainingDigits /= 10;
        int d5 = remainingDigits % 10;
        remainingDigits /= 10;
        int d4 = remainingDigits % 10;
        remainingDigits /= 10;
        int d3 = remainingDigits % 10;
        remainingDigits /= 10;
        int d2 = remainingDigits % 10;
        remainingDigits /= 10;
        int d1 = remainingDigits % 10;
        remainingDigits /= 10;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        
        String digits = "";
        digits = "bruh";

        if (d10 == 10) {
            digits = String.format("%d %d %d %d %d %d %d %d %d X", d1, d2, d3, d4, d5, d6, d7, d8, d9);
        } else {
            digits = String.format("%d %d %d %d %d %d %d %d %d %d", d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
        }

        System.out.println(digits);

        // String digits = String.format("%d %d %d %d %d %d %d %d %d", d1, d2, d3, d4, d5, d6, d7, d8, d9);
        // System.out.println(digits);


    }
}

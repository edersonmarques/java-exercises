import java.util.Scanner;

public class LoanPayments {
    public static void main(String[] args) {
        // It must let the user enter the interest rate, the loan amount, and the number of years for which payments will be made.
        // It must compute and display the monthly payment and total payment amounts.
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        input.close();
        double monthlyRate = (annualInterestRate / 100) / 12;
        
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, 12 * numberOfYears));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("\nThe monthly payment is: $" + (int)(monthlyPayment * 100) / 100.0 + "\n\nThe total payment is: $" + (int)(totalPayment * 100) / 100.0);
    }
}

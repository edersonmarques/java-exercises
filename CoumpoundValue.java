import java.util.Scanner;

public class CoumpoundValue {
    public static void main(String[] args) {
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        double accountValue = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();
        input.close();

        //WITHOUT LOOPS

        // after 1 month
        accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("Account value: " + accountValue);

        // after 2 months
        accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("Account value: " + accountValue);

        // after 3 months
        accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("Account value: " + accountValue);

        // after 4 months
        accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("Account value: " + accountValue);

        // after 5 months
        accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("Account value: " + accountValue);

        // after 6 months
        accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("Account value: " + accountValue);
    }
}

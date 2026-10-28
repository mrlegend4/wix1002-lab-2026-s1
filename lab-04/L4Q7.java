import java.util.Scanner;

public class L4Q7 {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter interest rate in %: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter total number of months: ");
        int months = input.nextInt();

        double monthlyRate = interestRate / 1200;

        double monthlyPayment = principal * monthlyRate
                / (1 - Math.pow(1 + monthlyRate, -months));

        double unpaidBalance = principal;
        double totalInterest = 0;

        System.out.printf("%-8s %-18s %-15s %-15s %-18s %-15s%n",
                "Month", "Monthly Payment", "Principal", "Interest",
                "Unpaid Balance", "Total Interest");

        for (int month = 1; month <= months; month++) {
            double interest = unpaidBalance * monthlyRate;
            double principalPaid = monthlyPayment - interest;

            unpaidBalance -= principalPaid;
            totalInterest += interest;

            System.out.printf("%-8d %-18.2f %-15.2f %-15.2f %-18.2f %-15.2f%n",
                    month, monthlyPayment, principalPaid, interest,
                    unpaidBalance, totalInterest);
        }

        input.close();
    }
}
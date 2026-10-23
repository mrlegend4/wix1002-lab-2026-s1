import java.util.Locale;
import java.util.Scanner;

public class L2Q2 {
    void main() {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Car price: ");
        double price = keyboard.nextDouble();
        System.out.print("Down payment: ");
        double downPayment = keyboard.nextDouble();
        System.out.print("Annual interest rate (%): ");
        double rate = keyboard.nextDouble();
        System.out.print("Duration (years): ");
        double years = keyboard.nextDouble();
        double monthly = (price - downPayment) * (1 + rate * years / 100)
                / (years * 12);
        System.out.printf(Locale.US, "Monthly payment: RM %.2f%n", monthly);
    }
}
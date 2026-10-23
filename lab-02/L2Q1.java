import java.util.Locale;
import java.util.Scanner;

public class L2Q1 {
    void main() {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = keyboard.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf(Locale.US, "Celsius: %.2f%n", celsius);
        keyboard.close();
    }
}
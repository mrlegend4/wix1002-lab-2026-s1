
import java.util.Scanner;

public class L3Q5 {
    void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double d = keyboard.nextDouble();
        double e = keyboard.nextDouble();
        double f = keyboard.nextDouble();

        double denominator = a * d - b * c;

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        }

        keyboard.close();
    }
}

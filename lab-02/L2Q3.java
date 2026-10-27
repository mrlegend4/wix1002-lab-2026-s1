import java.util.Locale;
import java.util.Random;

public class L2Q3 {
    void main() {
        Random generator = new Random();
        // For repeatable tests, replace the line above with new Random(42L).
        int first = generator.nextInt(41) + 10;
        int second = generator.nextInt(41) + 10;
        int third = generator.nextInt(41) + 10;
        int sum = first + second + third;
        double average = sum / 3.0;
        System.out.printf("Numbers: %d, %d, %d%n", first, second, third);
        System.out.println("Sum: " + sum);
        System.out.printf(Locale.US, "Average: %.2f%n", average);
    }
}
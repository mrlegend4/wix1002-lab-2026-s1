import java.util.Scanner;

public class L3Q6 {
    void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = keyboard.nextDouble();

        System.out.print("Enter a point (x, y): ");
        double x = keyboard.nextDouble();
        double y = keyboard.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= radius) {
            System.out.println("The point is inside the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }

        keyboard.close();
    }
}

import java.util.Scanner;

public class L3Q3 {
    void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter sales volume: ");
        double sales = keyboard.nextDouble();

        double commission;

        if (sales <= 100) {
            commission = sales * 0.05;
        } else if (sales <= 500) {
            commission = sales * 0.075;
        } else if (sales <= 1000) {
            commission = sales * 0.10;
        } else {
            commission = sales * 0.125;
        }

        System.out.printf("Total commission: %.2f%n", commission);

        keyboard.close();
    }
}

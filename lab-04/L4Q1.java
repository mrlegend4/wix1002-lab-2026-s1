import java.util.Scanner;

public class L4Q1 {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("The factors are: ");

        boolean first = true;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (!first) {
                    System.out.print(", ");
                }

                System.out.print(i);
                first = false;
            }
        }

        input.close();
    }
}
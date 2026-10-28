import java.util.Scanner;

public class L4Q2 {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.println("The sum is: " + sum);

        input.close();
    }
}
import java.util.Scanner;

public class L4Q4 {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

        int mayFirstDay = (firstDay + 120) % 7;
        int augustFirstDay = (firstDay + 212) % 7;

        System.out.println("\nMay " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < mayFirstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);

            if ((mayFirstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n\nAugust " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < augustFirstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);

            if ((augustFirstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}


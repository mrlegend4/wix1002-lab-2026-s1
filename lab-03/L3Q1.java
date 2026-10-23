import java.util.Scanner;

public class L3Q1 {
    void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();

        System.out.print("Enter the operand: ");
        char operator = keyboard.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
            case '-' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
            case '*' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
            case '/' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 / num2));
            case '%' -> System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 % num2));
              
            default -> System.out.println("Invalid operator.");
        }

        keyboard.close();
    }
}

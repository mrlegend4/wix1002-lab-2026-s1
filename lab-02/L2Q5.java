import java.util.Random;

public class L2Q5 {
    void main() {
        Random generator = new Random();
        int number = generator.nextInt(10001);
        int num = number;

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }
}
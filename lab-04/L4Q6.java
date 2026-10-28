import java.util.Random;

public class L4Q6 {
    void main() {
        Random random = new Random();

        int number = random.nextInt(Integer.MAX_VALUE);
        System.out.println("Number: " + number);

        int count = 0;
        int temp = number;

        do {
            count++;
            temp /= 10;
        } while (temp > 0);

        System.out.println("Number of digits: " + count);
    }
}
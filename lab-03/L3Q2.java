import java.util.Random;

public class L3Q2 {
    void main() {
        Random generator = new Random();
        int number = generator.nextInt(6);

        switch (number) {
            case 0 -> System.out.println(number + " is zero");
            case 1 -> System.out.println(number + " is one");
            case 2 -> System.out.println(number + " is two");
            case 3 -> System.out.println(number + " is three");
            case 4 -> System.out.println(number + " is four");
            case 5 -> System.out.println(number + " is five");
        }
    }
}

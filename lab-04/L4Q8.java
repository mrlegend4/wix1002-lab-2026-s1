import java.util.Scanner;

public class L4Q8 {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Prime numbers: 2, ");
        boolean first = true;
        
        for(int i=3; i<=100; i+=2) {
            boolean isPrime = true;
            for(int j=3; j*j<=i; j+=2) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                if(!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }

        input.close();
    }
}
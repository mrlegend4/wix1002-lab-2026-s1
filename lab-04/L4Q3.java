import java.util.Scanner;

public class L4Q3 {
    void main() {
        Scanner input = new Scanner(System.in);

        double score;
        double sum = 0;
        double sumSquares = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        while (true) {
            System.out.print("Enter a score (negative to quit): ");
            score = input.nextDouble();

            if (score < 0) {
                break;
            }

            sum += score;
            sumSquares += score * score;
            count++;

            if (score < min) {
                min = (int) score;
            }

            if (score > max) {
                max = (int) score;
            }
        }


        double average = sum / count;
        double variance =(sumSquares - sum * sum / count) / (count - 1);
        double standardDeviation = Math.sqrt(variance);

        System.out.printf("%.1f%n", variance);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Standard deviation: %.2f%n", standardDeviation);

        input.close();
    }
}
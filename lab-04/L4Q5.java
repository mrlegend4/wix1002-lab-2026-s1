import java.util.Random;

public class L4Q5 {
    void main() {
        Random random = new Random();

        int player1 = 0;
        int player2 = 0;
        int currentPlayer = 1;

        while (player1 <= 100 && player2 <= 100) {
            int dice = random.nextInt(6) + 1;

            System.out.println("Player " + currentPlayer
                    + " rolls: " + dice);

            if (currentPlayer == 1) {
                player1 += dice;
                System.out.println("Player 1 score: " + player1);
            } else {
                player2 += dice;
                System.out.println("Player 2 score: " + player2);
            }

            if ((currentPlayer == 1 && player1 > 100)
                    || (currentPlayer == 2 && player2 > 100)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (dice != 6) {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
    }
}
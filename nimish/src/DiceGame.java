import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Game!");
        System.out.print("Enter the number of rounds: ");
        int numRounds = scanner.nextInt();
        
        int player1Score = 0;
        int player2Score = 0;

        for (int round = 1; round <= numRounds; round++) {
            System.out.println("\nRound " + round + ":");
            System.out.print("Player 1, enter your move (1-6): ");
            int player1Move = getPlayerMove(scanner);
            System.out.println("Player 1 rolled: " + player1Move);
            player1Score += player1Move;

            System.out.print("Player 2, enter your move (1-6): ");
            int player2Move = getPlayerMove(scanner);
            System.out.println("Player 2 rolled: " + player2Move);
            player2Score += player2Move;
        }

        System.out.println("\nGame Over!");
        System.out.println("Player 1's total score: " + player1Score);
        System.out.println("Player 2's total score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    private static int getPlayerMove(Scanner scanner) {
        int move;
        do {
            System.out.print("Enter a number between 1 and 6: ");
            move = scanner.nextInt();
        } while (move < 1 || move > 6);

        return move;
    }
}

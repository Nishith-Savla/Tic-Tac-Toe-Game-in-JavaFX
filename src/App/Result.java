package App;

import java.util.ArrayList;
import java.util.List;

public class Result
{

    // Lists to store Moves of both players
    private static List<Integer> player1moves = new ArrayList<>(5);
    private static List<Integer> player2moves = new ArrayList<>(5);

    /**
     * Getter for private variable player1moves
     *
     * @return player1moves
     */
    public static List<Integer> getPlayer1moves()
    {
        return player1moves;
    }

    /**
     * Getter for private variable player2moves
     *
     * @return player2moves
     */
    public static List<Integer> getPlayer2moves()
    {
        return player2moves;
    }

    // List of all total possibilites of win
    private static int[][] possibilities = new int[][]{
        {1, 2, 3}, {4, 5, 6}, {7, 8, 9},
        {1, 4, 7}, {2, 5, 8}, {3, 6, 9},
        {1, 5, 9}, {3, 5, 7}
    };

    /**
     * Adds the moves to the moves list
     *
     * @param player1 Player 1
     * @param player2 Player 2
     * @param num Number of the box
     * @return Whether it is win or not
     */
    public static boolean add(Player player1, Player player2, int num)
    {
        if (Turn.getTurn() == player1) {
            player1moves.add(num);
        } else {
            player2moves.add(num);
        }
        return checkWin();
    }

    /**
     * Checks if it is win or not
     *
     * @return Is it win?
     */
    public static boolean checkWin()
    {
        List<Integer> winInstance = new ArrayList<>();
        for (int[] possibility : possibilities) {
            for (int num : possibility) {
                winInstance.add(num);
            }
            if (player1moves.containsAll(winInstance)) {
                player1moves = winInstance;
                return true;
            } else if (player2moves.containsAll(winInstance)) {
                player2moves = winInstance;
                return true;
            }
            winInstance.clear();
        }

        return false;
    }

    /**
     * Clear the list of moves for new game
     */
    public static void clearMoves()
    {
        player1moves.clear();
        player2moves.clear();
    }
}

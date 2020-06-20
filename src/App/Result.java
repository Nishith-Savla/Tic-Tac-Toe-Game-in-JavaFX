package App;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nishith
 */
public class Result
{

    protected static List<Integer> player1moves = new ArrayList<>(5);
    protected static List<Integer> player2moves = new ArrayList<>(5);

    static int[][] possibilities = new int[][]{
        {1, 2, 3}, {4, 5, 6}, {7, 8, 9},
        {1, 4, 7}, {2, 5, 8}, {3, 6, 9},
        {1, 5, 9}, {3, 5, 7}
    };

    public static boolean add(Player player1, Player player2, int num)
    {
        if (Turn.getTurn() == player1) {
            player1moves.add(num);
        } else {
            player2moves.add(num);
        }
        return checkWin();
    }

    public static boolean checkWin()
    {
        List<Integer> winInstance = new ArrayList<>();
        for (int[] possibility : possibilities) {
            for (int num : possibility) {
                winInstance.add(num);
            }
            if (player1moves.containsAll(winInstance)) {
                return true;
            } else if (player2moves.containsAll(winInstance)) {
                return true;
            }
            winInstance.clear();
        }

        return false;
    }

    public static void clearMoves()
    {
        player1moves.clear();
        player2moves.clear();
    }
}

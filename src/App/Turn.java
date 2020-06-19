package App;

/**
 *
 * @author Nishith
 */
public class Turn
{

    private static Player turn;

    public static Player getTurn()
    {
        return turn;
    }

    public static void setTurn(Player turn)
    {
        Turn.turn = turn;
    }

}

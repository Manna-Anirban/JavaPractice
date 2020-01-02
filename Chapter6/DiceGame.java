import java.util.Random;

public class DiceGame
{
    // Two instances of the Dice class, one computer, one player
    // Whoever rolls highest number wins for that round (10 rounds total)
    // Displays grand winner at the end

    private final static int DIE1_SIDES = 6;
    private final static int DIE2_SIDES = 6;
    private final static int ROUNDS = 10;

    public void game()
    {
        Die d1 = new Die(DIE1_SIDES); //Computers die
        Die d2 = new Die(DIE2_SIDES); // Players die
        int compTally = 0, userTally = 0;

        for(int i = 0; i < ROUNDS; i++)
        {
            d1.roll();
            d2.roll();
            System.out.println("Computer rolled " + d1.getValue()+", Player rolled "+d2.getValue()+"\t");
            if(d1.getValue() > d2.getValue())
            {
                System.out.println("Computer wins!");
                compTally++;
            }
            else if(d1.getValue() < d2.getValue())
            {
                System.out.println("Player wins!");
                userTally++;
            }
            else
            {
                System.out.println("It's a tie!");
            }
        }
        if(compTally > userTally)
        {
            System.out.println("\nComputer is grand winner!");
        }
        else if(userTally > compTally)
        {
            System.out.println("\nPlayer is grand winner!");
        }
        else
        {
            System.out.println("Computer and Player have tied!");
        }
    }
    public static void main(String[] args)
    {
        DiceGame dg = new DiceGame();
        dg.game();
    }
}
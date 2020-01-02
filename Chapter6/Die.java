import java.util.Random;

public class Die
{
    private int sides, value;
    public Die(int numSides)
    {
       sides = numSides;
       roll();

    }
    public void roll()
    {
        // Create random object
        Random r = new Random();

        // Get random value for the die
        value = r.nextInt(sides) + 1;
    }
    public int getSides()
    {
        return sides;
    }
    public int getValue()
    {
        return value;
    }
}

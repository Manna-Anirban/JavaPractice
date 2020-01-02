public class Dice
{
    // Two instances of the Dice class, one computer, one player
    // Program loops 10 times, each time the loop iterates, it should create two instances of the Die class
    // One Die object is the computer die, and the other Die object is the users die


    public static void main(String[] args)
    {
        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 5;

        // Create two instances of the Die class
        Die die1 = new Die(DIE1_SIDES);
        Die die2 = new Die(DIE2_SIDES);

        // Display initial state of the die
        System.out.println("This simulates rolling a "+ DIE1_SIDES+" sided die and a "+DIE2_SIDES+" sided die");
        System.out.println("Initial value of the dice: ");
        System.out.println(die1.getValue() +" "+ die2.getValue());

        // Rolls dice 5 times
        System.out.println("Rolling the dice " + MAX_ROLLS + " times");
        for(int i = 0; i < MAX_ROLLS; i++)
        {
            // Roll dice
            die1.roll();
            die2.roll();

            // Display output
            System.out.println(die1.getValue()+ " "+die2.getValue());
        }
    }
}
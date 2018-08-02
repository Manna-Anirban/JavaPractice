import java.util.Random;

public class EvenOdd
{
    // Write a method isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise
    // The program's main method should use a loop to generate 100 random integers
    // It should use the isEven method to determine whether each random integer, is even
    // or odd. When iteration is finished, the program should display the number of even integers and
    // the number of odd integers

    public boolean isEven(int n)
    {

        if(n%2==0)
           {
               return true;

           }
         return false;
    }

    public static void main(String[] args)
    {
        EvenOdd eo = new EvenOdd();
        Random rand = new Random();
        int randInt;
        int evenCounter = 0;
        int oddCounter = 0;
        for(int i = 1; i<=100; i++)
        {
            randInt = rand.nextInt(100)+1;
            System.out.println(randInt);
            eo.isEven(randInt);
            if(eo.isEven(randInt))
            {
                evenCounter++;
            }
            else if(!eo.isEven(randInt))
            {
                oddCounter++;
            }
        }
        System.out.println("\nEven numbers: "+ evenCounter);
        System.out.println("OddNumbers: "+oddCounter);
    }
}

import java.util.Scanner;

// Determines even or odd from 100 integers
public class EOCounter
{
    final static int NUM_OF_INTEGERS = 100;
    public boolean isEven(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        return false;
    }
    public void iterate()
    {
        EOCounter eo = new EOCounter();
        int evenCounter = 0, oddCounter = 0;
        int[] randInt = new int[NUM_OF_INTEGERS];
        for(int i = 0; i < randInt.length; i++)
        {
            randInt[i] = (int)(Math.random()*100) + 1;
            if(eo.isEven(randInt[i]))
            {
                System.out.println(randInt[i]+"\tEven");
                evenCounter++;
            }
            else
            {
                System.out.println(randInt[i]+"\tOdd");
                oddCounter++;
            }
        }
        System.out.println("\nNumber of even numbers: "+evenCounter+"\nNumber of odd numbers: "+oddCounter);
    }
    public static void main(String[] args)
    {
        String choice = " ";
        Scanner scan = new Scanner(System.in);
        EOCounter eo = new EOCounter();
        do{
            try{
                eo.iterate();
            }catch(Exception e)
            {
                System.out.print("\nInvalid input");
            }
            System.out.print("\nAgain? (y/n) ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));


    }
}
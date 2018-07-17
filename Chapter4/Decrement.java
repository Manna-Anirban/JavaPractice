import java.util.Scanner;

public class Decrement
{

    public void decrement()
    {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        for(int i = 0; i < 4; i++)
        {
            num = num - 2;
        }
        // Iterates four times
        // Shows number decremented by two each iteration

        System.out.println("Decremented number: " + num + "\n");


    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        Decrement myLoop = new Decrement();
        String choice;

        // Also testing out loops and exception handling
        do{
            try
            {
                myLoop.decrement();
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
            System.out.print("Again?(y/n): ");
            choice  = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));
    }

}
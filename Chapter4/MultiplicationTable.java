import java.util.Scanner;


// This program asks the user to enter a number and also the range up to which the user wants
// to display the multiplication table

public class MultiplicationTable
{

    public void table(int number, int range)
    {
        int total;
        for(int i = 1; i <= range; i++)
        {
            total = number*i;
            System.out.println(number +" x "+i + " = "+ total);
        }
    }
    public static void main(String[] args)
    {   String choice;
        MultiplicationTable mytable = new MultiplicationTable();
        Scanner scan = new Scanner(System.in);


        do
        {
            try {
                System.out.print("\nEnter a number: ");
                int number = scan.nextInt();
                System.out.print("\nEnter a range: ");
                int range = scan.nextInt();

                mytable.table(number, range);
            }
            catch (Exception e)
            {
                System.out.print("\nInvalid input");
            }
            scan.nextLine();
            System.out.print("\nAgain?: ");
            choice = scan.nextLine();

        }while(choice.equalsIgnoreCase("y"));
    }

}


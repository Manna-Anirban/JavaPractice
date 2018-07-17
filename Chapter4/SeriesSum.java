import java.util.Scanner;

public class SeriesSum
{

    // Using for loops to calculate sum of a series of numbers given an integer
    public void series()
    {
        Scanner scan = new Scanner(System.in);

        // User inputs last number to be added
        System.out.print("\nPlease enter an integer: ");
        int numEnd = scan.nextInt();
        int number = numEnd;
        System.out.println();

        // This for loop is for printing the added numbers
        for (int j = 1; j <= numEnd; j++)
        {
            System.out.print(j + "/"+ number + " + ");
            number--;
        }
        System.out.println("0 = ");


        // This for loop is for calculating the total
        double total = 0;
        double n = numEnd;
        for(int i = 1; i <= numEnd; i++)
        {
            total = total + (i/n);
            n--;
        }
        System.out.println(total);


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String choice;
        SeriesSum myLoop = new SeriesSum();

        do{
            try
            {
                myLoop.series();

            } catch (Exception e) {
                System.out.println("Invalid input");

            }
            System.out.print("\nAgain?(y/n): ");
            choice  = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));

        System.out.println("\nThank you!\n");
    }
}


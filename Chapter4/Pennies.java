import java.util.Scanner;


// Calculates a person's earnings over a period of time if salary was one penny the
// first day, and doubles every day after that

public class Pennies
{
    public void salary(int day)
    {
        if(day < 1)
        {
            System.out.println("Invalid Input");
        }
        System.out.printf("\n%11s%26s\n", "Day", "Amount");
        for(int i = 1; i <= day; i++)
        {
            double pennies = Math.pow(2, i - 1);

            double dollar = pennies / 100;
            String dollars = "$"+Double.toString(dollar);
            System.out.printf("%10d%26s\n", i, dollars);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Pennies pn = new Pennies();
        String choice;

        System.out.println("\nThis program calculates a person's total earnings "
                + "if that person earned a penny the first day and doubled every "
                + "day after that.\n");
        do
        {
            try
            {
                System.out.print("Enter the number of days the person worked: ");
                int days = scan.nextInt();

                pn.salary(days);

            }
            catch(Exception e)
            {

                System.out.println("\nInvalid Input");
            }


            scan.nextLine();
            System.out.print("\nTry again?(y/n) ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("y"));


    }

}


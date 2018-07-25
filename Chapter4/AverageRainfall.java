import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class AverageRainfall
{
    // Asks user for a number of years
    // Each month will ask user for the average rainfall of that month
    // Outputs the number of months, the total inches of rainfall, and the average rainfall
    // per month for the entire period

    private int MONTHS = 12;

    public String formatMonth(String month) throws ParseException
    {
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        SimpleDateFormat monthDisplay = new SimpleDateFormat("MMMM");
        return monthDisplay.format(monthParse.parse(month));
    }

    private void rain()throws ParseException
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of years in this period: ");
        int years = scan.nextInt();
        if(years < 1)
        {
            do {
                System.out.print("Please enter an integer above 0: ");
                years = scan.nextInt();
            }while(years < 1);
        }
        double rainfall;
        double totalRain = 0;
        double avgRain = 0;
        int yearCounter = 0;

        for(int i = 1; i <= years; i++)
        {
            System.out.println("\nYear "+i);
            System.out.println("----------------");
            for(int j = 1; j <= MONTHS; j++)
            {
                String jj = Integer.toString(j);
                System.out.print("What is the average rainfall for " + formatMonth(jj)+": ");
                rainfall = scan.nextDouble();
                if(rainfall < 0)
                {
                    System.out.print("\nPlease enter a positive value: ");
                    rainfall = scan.nextDouble();
                }
                totalRain = totalRain + rainfall;

            }
            System.out.println();
            yearCounter++;
            avgRain = (totalRain/(yearCounter*12));
        }

        System.out.println("Number of months: "+ (yearCounter*12));
        System.out.printf("Total rainfall for entire period: %.2f" + " inches\n", totalRain);

        System.out.printf("Average monthly rainfall for entire period: %.2f" + " inches\n", avgRain);

    }

    public static void main(String[] args)
    {
        AverageRainfall avg = new AverageRainfall();
        Scanner scan = new Scanner(System.in);
        String choice;

        do
        {
            try
            {
                avg.rain();

            }catch(Exception e)
            {
                System.out.println("\nInvalid Input");
            }

            System.out.print("\nTry again?(y/n) ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));


    }

}

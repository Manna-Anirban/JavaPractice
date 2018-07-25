import java.util.Scanner;

public class Population
{
    // Predicts the size of a population of organisms
    // Asks the user for...
    // ...starting number of organisms, their average daily population increase(percentage), and number of days
    // they will multiply
    // Program will loop to display the size of the population for each day

   private int initial;
   private double popIncrease;
   private int days;
    public void input()
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the initial number of organisms: ");
        initial = scan.nextInt();
        do {
            if (initial < 2) {
                System.out.print("\t\nPlease enter an integer greater than 1: ");
                initial = scan.nextInt();
            }
        }while(initial < 2);
        System.out.print("\nEnter the average daily population increase(decimal value, not percentage): ");
        popIncrease = scan.nextDouble();

        do {
            if (popIncrease < 0) {
                System.out.print("\t\nPlease enter a positive value: ");
                popIncrease = scan.nextDouble();
            }
        }while(popIncrease < 0);
        System.out.print("\nEnter the number of days during which the animals will multiply: ");
        days = scan.nextInt();
        do {
            if (days < 0) {
                System.out.print("\t\nPlease enter a positive value: ");
                days = scan.nextInt();
            }
        }while(days < 0);
    }
    public void population()
    {
        input();

        double multIncrease = 0;
        double addIncrease = 0;
        double newInitial = initial;

        System.out.println("\nDay 1");
        System.out.println("------------");
        System.out.printf("%.2f\n",newInitial);

        for(int i = 2; i <= days; i++)
        {
            System.out.println("\nDay "+i);
            System.out.println("------------");

            multIncrease = newInitial*popIncrease;
            addIncrease = newInitial + multIncrease;
            newInitial = addIncrease;
            System.out.printf("%.2f\n",addIncrease);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Population pop = new Population();
        String choice;
        do
        {
            try
            {
                pop.population();

            }catch(Exception e)
            {
                System.out.println("\nInvalid Input\n");
            }

            System.out.print("\nTry again?(y/n): ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));
    }
}

import java.util.Scanner;

public class IsPrime
{
    // A prime number is a number that is evenly divisible only by itself and 1
    // Write a method named isPrime, which takes an integer as an argument
    // and returns true if the argument is a prime number, or false otherwise

    public boolean isPrime(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        IsPrime myPrime = new IsPrime();
        String choice;

        do{

            try {
                System.out.print("\nEnter an integer: ");
                int enter = scan.nextInt();

                if(myPrime.isPrime(enter))
                {
                    System.out.println("\n"+enter + " is a prime number!");
                }
                else if(!myPrime.isPrime(enter))
                {
                    System.out.println("\n"+enter + " is a not prime number");
                }
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid Input\n");
            }

            scan.nextLine();
            System.out.print("\nTry again?(y/n): ");
            choice = scan.nextLine();

        }while(choice.equalsIgnoreCase("yes")||choice.equalsIgnoreCase("y"));

    }
}

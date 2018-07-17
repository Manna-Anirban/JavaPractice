import java.util.Scanner;

public class SumLoop
{
    public void sum()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        int first =0;
        int second =0;
        String choice;

        do
        {
            try {
                System.out.print("Enter first number: ");
                first = scan.nextInt();
                System.out.print("Enter second number");
                second = scan.nextInt();
            }catch(Exception e)
            {
                System.out.println("Invalid input");
            }


                int sum = first + second;
                System.out.println("\n" + sum);


            scan.nextLine();
            System.out.print("Continue?(y/n) ");
            choice = scan.nextLine();

            System.out.println();

        }while(choice.equalsIgnoreCase("y"));


    }

    public static void main(String[] args)
    {
        SumLoop sum = new SumLoop();
        sum.sum();
    }


}
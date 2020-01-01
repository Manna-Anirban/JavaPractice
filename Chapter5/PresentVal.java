import java.util.Scanner;

public class PresentVal
{
    // Using present value formula P = F / (1 + r)^n

    public double presentValue(double futureVal, double yearInterest, int numYears)
    {

        return (futureVal / (Math.pow((1+yearInterest),numYears)));  //formula
    }
    public static void main(String[] args)
    {
        PresentVal pv = new PresentVal();
        Scanner scan = new Scanner(System.in);
        String choice = "";
        do {
            try{
                System.out.print("Present Value Formula\n\nEnter future value: ");
                double fv = scan.nextDouble();
                System.out.print("Enter annual interest rate: ");
                double air = scan.nextDouble();
                System.out.print("Enter number of years: ");
                int numYear = scan.nextInt();
                System.out.println("You must deposit $"+ (String.format("%.2f", pv.presentValue(fv, air, numYear)))+" today to achieve this.");
            }
            catch(Exception e)
            {
                System.out.println("Invalid input");
            }
            scan.nextLine();
            System.out.print("\nAgain?(y/n): ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));
    }
}
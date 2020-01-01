import java.util.Scanner;

public class DepositWithdraw
{
    public static double startBal, yearInterest;                   //start balance and yearly interest parameters
    public DepositWithdraw(double startBal, double yearInterest)
    {
        this.startBal = startBal;
        this.yearInterest = yearInterest;
    }
    public DepositWithdraw(){} // default constructor

    public double deposit(double add)      //deposit function
    {
        return startBal += add;
    }
    public double withdraw(double sub)    // withdraw function
    {
        return startBal -= sub;
    }
    public double interestAccrue()             // monthly interest accrual
    {
        double monthInterest = yearInterest / 12;
        return startBal += (monthInterest*startBal);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start balance: ");
        double start = scan.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double air = scan.nextDouble();
        System.out.print("Enter number of months since account established: ");
        int numMonths = scan.nextInt();

        DepositWithdraw dw = new DepositWithdraw(start, air);
        for (int i = 0; i < numMonths; i++) {
            double monthInterest = 0;
            System.out.println("\nMonth " + (i + 1) + "\n----------");
            System.out.print("Enter amount deposited this month: ");
            double depo = scan.nextDouble();
            System.out.print("Enter amount withdrawn this month: ");
            double taken = scan.nextDouble();
            dw.deposit(depo);
            dw.withdraw(taken);
            dw.interestAccrue();
            System.out.print("\nWith added monthly interest, account balance is $" + (String.format("%.2f", startBal))+"\n");
        }
    }
}
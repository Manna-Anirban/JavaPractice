import java.util.Scanner;

// ex) 370
//  (3^3) + (7^3) +(0^3) = 370 --> Armstrong number

public class Armstrong
{

    public void checkArmstrong(int num)
    {
        String number = Integer.toString(num);
        int sum = 0;
        for(int i = 0; i < number.length(); i++) // stores in array
        {
            sum += (Math.pow(Character.getNumericValue(number.charAt(i)),3)); // char to int
        }
        if(sum == num)
        {
            System.out.println("This number is an Armstrong number");
        }
        else
        {
            System.out.println("This number is not an Armstrong number");
        }

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Armstrong a = new Armstrong();
        String again = "";
        do {
            try {
                System.out.print("\nEnter a number: ");
                int number = scan.nextInt();
                a.checkArmstrong(number);
            }
            catch(Exception e) {
                System.out.print("\nInvalid input");
            }
            scan.nextLine();
            System.out.print("\nAgain? (y/n) ");
            again = scan.nextLine();
        }while(again.equalsIgnoreCase("y"));
    }
}
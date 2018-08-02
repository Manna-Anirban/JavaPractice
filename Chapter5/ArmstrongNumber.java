import java.util.Scanner;

public class ArmstrongNumber
{
    // Armstrong number --> if the sum of the cube of its individual digits is
    // equal to the number itself
    // ex) 370 = (3^3) + (7^3) + (0^3)
    // Write a method that checks whether or not a given number is an Armstrong number

    public void isArmstrong(int n)
    {
        int cubeInt = 0;
        int totalSum = 0;
        String number = String.valueOf(n);
        for(int i = 0; i < number.length(); i++)
        {
            int j = Character.digit(number.charAt(i), 10);
            System.out.println("digit " +(i+1)+": " + j);
            cubeInt = (int)(Math.pow(j,3));
            totalSum += cubeInt;

        }
        if(totalSum == n)
        {
            System.out.println("\n"+n+ " is an Armstrong number!\n");
        }
        else
        {
            System.out.println("\n"+n+ " is not an Armstrong number\n");
        }
    }
    public static void main(String[] args)
    {
        ArmstrongNumber arm = new ArmstrongNumber();
        Scanner scan = new Scanner(System.in);
        String choice;

        do {
            try {
                System.out.print("\nEnter an integer: ");

                int enter = scan.nextInt();

                arm.isArmstrong(enter);
            }catch (Exception e)
            {
                System.out.println("\nInvalid Input\n");
            }

            scan.nextLine();
            System.out.print("Try again?(y/n): ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));
    }
}

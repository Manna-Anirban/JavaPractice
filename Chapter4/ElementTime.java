import java.util.Scanner;
public class JavaPractice
{
    final int AIR = 1100;
    final int WATER = 4900;
    final int STEEL = 16400;

    // Asks user for element and distance, outputs amount of time it will take fr sound wave to travel through element
    public void speed()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Air\n2.Water\n3.Steel\n");
        System.out.print("Enter the number of the element: ");
        int element = scan.nextInt();
        System.out.print("Enter the distance(in feet): ");
        double distance = scan.nextDouble();
        double time = 0;

        if(element == 1)
        {
            time = distance / AIR;
        }
        else if(element == 2)
        {
            time = distance / WATER;
        }
        else if(element == 3)
        {
            time = distance / STEEL;
        }

        System.out.println("\nIt takes "+time+" seconds to travel through that element");

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        JavaPractice jp = new JavaPractice();
        String choice;
        do {
            try {

                jp.speed();
            } catch (Exception e) {
                System.out.print("\nInvalid input");
            }
            System.out.print("\nTry Again? (y/n): ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));

    }
}
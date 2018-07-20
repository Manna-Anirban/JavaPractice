import java.util.Scanner;

// Calculates the distance traveled for each hour given time and speed
//
// In progress --> Add a better String formatter
public class DistanceTraveled
{
    public void table(int hour, int speed)
    {


        System.out.println("Hour\t\tDistance Traveled");
        System.out.println("---------------------------------");
        for(int i = 1; i <= hour; i++)
        {
            int dist =i*speed;
            System.out.println(i+"\t\t\t\t\t"+dist);
            System.out.println();

        }

    }

    public static void main(String[] args)
    {
        DistanceTraveled dist = new DistanceTraveled();
        Scanner scan = new Scanner(System.in);
        String choice;
        do
        {
            try
            {
                System.out.print("\nEnter the number of hours traveled: ");
                int hour = scan.nextInt();
                System.out.print("\nEnter the speed of the vehicle: ");
                int speed = scan.nextInt();
                System.out.println();

                if(hour < 1)
                {
                    System.out.print("\nInvalid Input(Please input a time greater than one hour)");
                }
                else if(speed < 0 )
                {
                    System.out.print("\nInvalid Input(Please input a speed greater than 0 mph)");
                }
                else
                {
                    dist.table(hour, speed);
                }
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input");
            }
            scan.nextLine();
            System.out.print("\n\nTry again?(y/n): ");
            choice = scan.nextLine();

        }while(choice.equalsIgnoreCase("y"));



    }
}

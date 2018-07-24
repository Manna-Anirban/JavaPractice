import java.util.Scanner;

public class Hotel
{
    Scanner scan = new Scanner(System.in);

    private void floorIterator()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of floors this hotel has: ");
        int floors = scan.nextInt();

        int totalRooms = 0;
        int totalOccRooms = 0;
        for(int i = 1; i <= floors; i++)
        {
            System.out.print("\nHow many rooms are on floor " +i+"? ");
            int rooms = scan.nextInt();
            totalRooms = totalRooms + rooms;
            System.out.print("\nHow many of those rooms are occupied on floor " +i+"? ");
            int occRooms = scan.nextInt();
            totalOccRooms = totalOccRooms + occRooms;

        }
        int vacant = totalRooms - totalOccRooms;
        double occRate = (((double)totalOccRooms/(double)totalRooms)*100);
        System.out.println(occRate);
        System.out.println("\nHotel Stats");
        System.out.println("----------------");
        System.out.println("Total number of rooms in hotel: "+ totalRooms);
        System.out.println("Total number of occupied rooms in hotel: " + totalOccRooms);
        System.out.println("Total number of vacant rooms in hotel: " + vacant);
        System.out.printf("\nOccupancy Rate: %.2f" ,occRate);
        System.out.print("%\n");
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Hotel h = new Hotel();
        String choice;
        do
        {
            try
            {
                h.floorIterator();
            }catch(Exception e)
            {
                System.out.println("\nInvalid input");
            }


            System.out.print("\nTry again(y/n): ");
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes"));
    }
}

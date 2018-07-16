import java.util.Scanner;

public class TestAverage
{
    public static void main(String[] args)
    {
        int score, total;
        double avg;

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number of students: ");
        int numStudent = scan.nextInt();

        System.out.print("Enter the number of tests per student: ");
        int numTest = scan.nextInt();

        for(int i = 1; i<= numStudent; i++)
        {
            total = 0;
            System.out.println();
            System.out.println("Student number " + i);
            System.out.println("--------------------------");

            for(int j = 1; j<= numTest; j++)
            {
                System.out.print("Enter score " + j + ": ");
                score = scan.nextInt();

                total = total + score;

            }

            avg = total/numTest;
            System.out.println();
            System.out.printf("The average for student %d is is %.1f\n\n",i, avg);

        }
    }
}
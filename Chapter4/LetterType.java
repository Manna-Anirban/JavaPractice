import java.util.Scanner;

public class LetterType
{

    public void check()
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter a letter: ");
        char choice = scan.next().trim().charAt(0);
        if (Character.isUpperCase(choice)) {
            choice = Character.toLowerCase(choice);
        }

        if (choice >= 65 && choice <= 122) {
            if (choice == 'a' || choice == 'e' || choice == 'i' || choice == 'o' || choice == 'u') {
                System.out.println(choice + " is a vowel.");
                System.out.println();
            } else {
                System.out.println(choice + " is a consonant.");
                System.out.println();
            }
        } else if (choice >= 48 && choice <= 57) {
            System.out.println("Please input a letter not a digit\n");
        } else {
            System.out.println("Please enter a letter not a special character");
        }
    }

    public static void main(String[] args)
    {
        LetterType method = new LetterType();
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("Start?(y/n): ");
        String start = scan.nextLine();
        System.out.println();

        while(start.equalsIgnoreCase("y"))
        {
            method.check();
            System.out.print("Again?(y/n): ");
            start = scan.nextLine();
            System.out.println();
        }


    }
}
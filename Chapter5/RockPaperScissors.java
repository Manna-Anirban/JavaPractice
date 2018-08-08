import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    // Write a program that lets the user play the game of rock, paper scissors
    // against the computer

    private void play()
    {
        int compChoice;
        int choice;
        do {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        compChoice = rand.nextInt(3)+1;

        System.out.println("1. Rock\n2. Paper\n3. Scissors\n4. Quit");
        choice = scan.nextInt();


            if (compChoice == 1 && choice == 2) {
                System.out.println("Computer chose Rock!\n");
                System.out.println("paper beats rock\nUser wins\n");

            }
            if (compChoice == 1 && choice == 3) {
                System.out.println("Computer chose Rock!\n");
                System.out.println("Rock beats scissors\n Computer wins\n");
            }
            if (compChoice == 2 && choice == 1) {
                System.out.println("Computer chose Paper!\n");
                System.out.println("Paper beats rock\n Computer wins\n");
            }
            if (compChoice == 2 && choice == 3) {
                System.out.println("Computer chose Paper!\n");
                System.out.println("Scissors beats paper\nUser wins\n");
            }
            if (compChoice == 3 && choice == 1) {
                System.out.println("Computer chose Scissors!\n");
                System.out.println("Rock beats scissors\nUser wins\n");
            }
            if (compChoice == 3 && choice == 2) {
                System.out.println("Computer chose Scissors!\n");
                System.out.println("Scissors beats paper\nComputer wins\n");
            }
            if(compChoice == choice)
            {
                System.out.println("It's a draw play again!");
            }
        }while(compChoice == choice);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();

        rps.play();
    }
}

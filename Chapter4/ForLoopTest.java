import java.util.Scanner;

public class ForLoopTest()
{

    private final int END = 1000;

    // Prints out all numbers divisible by 10 until 1000
    public void loop()
    {
        for(int i = 0; i <= END; i++)
        {
            if(i % 10 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        ForLoopTest() myLoop = new ForLoopTest());
        myLoop.loop();
        System.out.println();
    }

}
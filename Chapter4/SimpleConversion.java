import java.util.Scanner;

public class SimpleConversion
{


    // Still need to work on the error checking...
    // Also, I want to try to give the option of how many digits user can round to

    public void convert()
    {


      Scanner scan = new Scanner(System.in);

      for(int i = 9; i > 0; i--)
      {
          if(i == 1)
          {
              System.out.print("\nEnter a kilogram value to convert to grams(" + i + " time remaining): ");
              double input = scan.nextDouble();

              double result = input / 1000;

              System.out.printf("\nHere is the result in grams: %f\n", result);
          }

          else {
              System.out.print("\nEnter a kilogram value to convert to grams(" + i + " times remaining): ");
              double input = scan.nextDouble();

              double result = input / 1000;

              System.out.printf("\nHere is the result in grams: %f\n", result);
          }

      }


    }

    public static void main(String[] args)
    {
        SimpleConversion pat = new SimpleConversion();

        pat.convert();
        System.out.println("\n\n9 times completed, thank you!\n");
    }
}


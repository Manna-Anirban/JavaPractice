
public class SumSquareDifference
{
    /*

        The difference between the sum of the squares of the
        first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

          Find the difference between the sum of the squares of the
          first one hundred natural numbers and the square of the sum.

    */


    private void run()
    {
        final int endNum = 100;
        int totalSquare = 0;
        int totalSum = 0;
        for(int i = 1; i <= endNum; i++)
        {
            totalSquare = (int)(totalSquare + Math.pow(i,2));
        }
        System.out.println(totalSquare);

        for(int j = 1; j<= endNum; j++)
        {
          totalSum += j;
        }
        totalSum = (int)(Math.pow(totalSum,2));

        System.out.println(totalSum);
        int difference = totalSum - totalSquare;

        System.out.println(difference);
    }
    public static void main(String[] args)
    {
        SumSquareDifference ssd = new SumSquareDifference();

        ssd.run();

        // TestNG works fine, but I need to make an actual program and
        // see what the test outputs.

    }
}

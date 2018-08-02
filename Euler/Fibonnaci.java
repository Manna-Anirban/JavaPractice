public class Fibonnaci
{
    // By considering the terms in the Fibonacci sequence whose
    // values do not exceed four million, find the sum of the even-valued terms.

    // 1,2,3,5,8,13,21,34,55,89,...

    public void fibonacci()
    {
        int x = 1;
        int y = 2;

        final int LASTNUM = 4000000;
        int totalEven = 0;

        while(x < LASTNUM)
        {
            if(x % 2==0)
            {
                totalEven += x;
            }

            int z = x + y;
            x = y;
            y = z;
        }
        System.out.println(totalEven);
    }

    public static void main(String[] args)
    {

            Fibonnaci fib = new Fibonnaci();
            fib.fibonacci();

    }
}

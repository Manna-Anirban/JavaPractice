public class SmallestMultiple
{
    /*
        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    
    // I know this is not that efficient, but it's the first thing that came to mind

    private void run()
    {
        final long lastNum = 999999999;
        int counter = 0;
        for(int i = 1; i < lastNum; i++)
        {
            for(int j = 1; j <= 20; j++)
            {

                if(i % j==0)
                {
                    counter++;
                    if(counter == 20)
                    {
                        System.out.println(i);
                        System.exit(0);
                    }
                }
                else
                {
                    counter = 0;
                }
            }

        }

    }
    public static void main(String[] args)
    {

        SmallestMultiple sm = new SmallestMultiple();
        sm.run();

    }
}

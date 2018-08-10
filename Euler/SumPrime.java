
public class SumPrime
{
   // Find the sum of all primes under 2 million

   // EDIT --> It works, but it takes a while to compile(approx 9 minutes for me)


    public boolean isPrime(int n)
    {
        for (int i = 2; i < n; i++)
        {

            if (n % i == 0)
            {

                return false;
            }
        }
        return true;
    }
    public long primeSum(long n)
    {
        long total = 0;
        for(int i = 2; i < n; i++)
        {
            if(isPrime(i))
            {
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args)
    {
        SumPrime sp = new SumPrime();
        System.out.println(sp.primeSum(2000000));
    }

}

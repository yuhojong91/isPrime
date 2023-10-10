public class Solution {
    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                return false; 
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        System.out.println(isPrime(2));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(31));
        System.out.println(isPrime(577));
        System.out.println(isPrime(-1));
    }
}

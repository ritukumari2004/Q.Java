//Find all the Prime Numbers in a Given Interval
public class Q10 {
    public static void main(String[] args) {
        int lower = 1, upper = 20;
        for (int i = lower; i <= upper; i++)
          if (isPrime (i))
          System.out.println (i);
      }
   
      static boolean isPrime (int n)
      {
        int count = 0;
        if (n < 2)
           return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
           {
         if (n % i == 0)
           return false;
           }
    
         // if reached here then must be true
         return true;   
    }
    
}

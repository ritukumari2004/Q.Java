//Factorial of a Number
public class Q17 {
    public static void main(String[] args) {
            int n = 6;
            int fact = 1;
            for(int i = 1 ; i <=n ; i ++)
            {
            fact = fact * i; }
            System.out.println(fact + " is thefactorial of " + n);
         }
}
    
// static int factorial(int n)
// 	{
// 		if (n == 0)
// 			return 1;
// 		return n * factorial(n - 1);
// 	}
	
// 	
// 	public static void main(String[] args)
// 	{
// 		int num = 6;
// 		System.out.println("Factorial of " + num + " is " + factorial(num));
// 	}

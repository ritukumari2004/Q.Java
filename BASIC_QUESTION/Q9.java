//Check Whether a Given Number is Prime or Not
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        boolean isPrime = true;
        
        if (num < 2) {
            isPrime = false;
        } else {
    /*Now a and b can't be both greater than the square root of n, 
     since then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
     So in any factorization of n, at least one of the factors must be smaller 
     than the square root of n, and if we can't find any factors less than or equal to 
     the square root, n must be a prime.*/
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close();
    }
}

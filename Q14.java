public class Q14 {
    public static void main(String[] args) {
     int number = 371, originalNumber, rem, res = 0, n=0;
        originalNumber = number;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        while (originalNumber != 0) {
            rem = originalNumber % 10;
            res += Math.pow(rem, n);
            originalNumber /= 10;
        }

        if(res == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

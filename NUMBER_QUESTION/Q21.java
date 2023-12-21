//find number of digits in an integer
//No. of digits : (int)(Math.log10(number))+1
public class Q21 {
    public static void main(String[] args) {
        int number = 12345;

		//declare a variable to count number of digits
		int digit = 0;
		while(number != 0)
		{
			//pick last digit of the number and count one by one
			int picklast = number % 10;
			digit++;
			number = number / 10;
		}

		//display number of digits
		System.out.print("Number of Digits = "+digit);
    }
}

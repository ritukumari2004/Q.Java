//To check whether a number is harshad number or not

public class Q25 {
    public static void main(String[] args) {
        int n = 345;
		int result = 0;
        int originalN = n;
		while(n != 0)
		{
			int pick_last = n % 10;
			result = result + pick_last;
			n = n / 10;
		}
      if(originalN % result == 0){
          System.out.println("Harshad Number");
      }
      else{
        System.out.println("Not a Harshad Number");
      }
    }
}

//Find the Sum of the Digits of a Number
public class Q11 {
   public static void main(String[] args) {
    int num=3456;
    int sum=0;
    while(num!=0){
        sum+=num%10;//Modulo Operator % : We’ll use this to extract the digits from the number.
        num=num/10;//Divide Operator / : We’ll use it to shorten the number by 1 digit.

    }
    System.out.println(sum);
   } 
}

//USING RECURSION
// public class Main
//  {
//    public static void main (String[]args)
//    {

//      int num = 12345, sum = 0;
//        System.out.println ("Sum of digits : " + getSum (num, sum));
//    }

//    static int getSum (int num, int sum)
//    {

//      if (num == 0)
//        return sum;

//      sum += num % 10;
//      return getSum (num / 10, sum);
//    }
//  }

//Check Whether or Not the Number is a Palindrome

public class Q13 {
   public static void main(String[] args) {
    int num=12021,rev=0,rem,temp;
    temp=num;
    while(temp !=0){
        rem=temp%10;
        rev=rev * 10 + rem;
        temp /= 10;
    }
    if(num ==rev)
      System.out.println(num + " is Palindrome");
    else
      System.out.println(num + "is not Palindrome");  
   } 
}

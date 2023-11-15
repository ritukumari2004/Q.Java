//Check Whether or Not the Year is a Leap Year
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE YEAR:");
        int year=sc.nextInt();
        if(year%400==0)
        System.out.println("LEAP YEAR");
        else if(year%4==0 && year%100!=0)
        System.out.println("LEAP YEAR");
        else
        System.out.println("NOT LEAP YEAR");
    }
}

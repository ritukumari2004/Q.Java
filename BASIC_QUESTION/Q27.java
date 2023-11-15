//Check Whether or Not the Two Numbers are a Friendly Pair
public class Q27 {
    public static void main(String[] args) {
        int n1 = 30,n2 = 140;
        int sum1=getDivisorsSum(n1);
        int sum2=getDivisorsSum(n2);

        if(sum1/n1 == sum2/n2)
         System.out.println(n1 + " & "+n2+" are friendly pairs");
        else
         System.out.println(n1 + " & "+n2+" are not friendly pairs");  
    }
    static int getDivisorsSum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i == 0)
            sum = sum + i;
              
            }
        
    return sum;
    }
}

//Find the Sum of the Numbers in a Given Range
public class Q5 {
    public static void main(String[] args) {
        int a=5;
        int b=10;

        int sum = 0;

        for(int i = a; i<=b;i++){
            sum = sum +i;
        }
            System.out.println(sum);
        
    }
}
// public class Q5 {
//     public static void main(String[] args) {
//         int a=5;
//         int b=10;
//         int sum=b*(b+1)/2-a*(a+1)/2 +a;
//         System.out.println(sum);
//     }
// }

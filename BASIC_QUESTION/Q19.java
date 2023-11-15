// Factors of a number
public class Q19 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of " + num + "are");
        for(int i=1;i<=num;i++){
            if(num%i == 0)
             System.out.println(i + " ");
        }
    }
}

//Find Prime Number between 1 to 100

// Method 1: Basic checking prime by only checking first n
// Method 2: Basic checking prime by only checking first n/2 divisors
// Method 3: Checking prime by only checking first √n divisors
// Method 4: Checking prime by only checking first √n divisors, but also skipping even iterations
// public class Q20 {
//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             if(checkPrime(i)){
//                 System.out.print(i+" ");
//             }
//         }
//     }
//         public static boolean checkPrime(int num){
//             if(num<2){
//                 return false;
//             }
//             else{
//                 for(int i=2;i<num/2;i++){
//                     if(num%i==0){
//                         return false;
//                     }
//                 }
//             }
//             return true;
//         }
//             }
        
// public class Q20 {
//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             if(checkPrime(i)){
//                 System.out.print(i+" ");
//             }
//         }
//     }
//         public static boolean checkPrime(int num){
//             if(num<2){
//                 return false;
//             }
//             else{
//                 for(int i=2;i<Math.sqrt(num);i++){
//                     if(num%i==0){
//                         return false;
//                     }
//                 }
//             }
//             return true;
//         }
//             }


public class Q20 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
        public static boolean checkPrime(int num){
            if(num<=1){
                return false;
            }else if(num==2){
               return true; 
            }else if(num%2==0){
                return false;
            }
                for(int i=3;i<Math.sqrt(num);i++){
                    if(num%i==0){
                        return false;
                    }
                }
            
            return true;
        }
            }            
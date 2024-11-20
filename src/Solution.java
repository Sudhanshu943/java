
import java.util.Scanner;

class Solution {
    public static int subtractProductAndSum(int n) {   
            int product = 1;
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                n  /= 10;
    
                sum = sum + rem;
                product = product * rem;
            }
            System.out.println(product);
            System.out.println(sum);
            return product-sum;
        }
        public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(subtractProductAndSum(n));
        }
    }
    
}
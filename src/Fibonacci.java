
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the range of the series: ");
            int range = sc.nextInt();
            int a = 0;
            int b= 1;
            int count = 2;
            while (count <= range) {
                int fibbo = a;
                a = b;
                b = fibbo + b;
                System.out.println(fibbo);
                count++;
            }        
            System.out.println("this is the nth fibbo " + b);
        }
    }
}


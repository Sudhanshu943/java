package code.preactic;

import java.util.Scanner;

public class Factors {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        for(int i = 1; i <=num; i++){
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
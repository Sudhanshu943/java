package code.preactic;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number: ");
            int num2 = sc.nextInt();
            
            if(checkNum(num1)){
                System.out.println(num1+" is a Buzz Number.");
            }else{
                System.out.println(num1+" is not a Buzz Number.");
            }
            
            if(checkNum(num2)){
                System.out.println(num2+" is a Buzz Number.");
            }else{
                System.out.println(num2+" is not a Buzz Number.");
            }
        }
    }

    static boolean checkNum(int num){
        if(num%10 == 7 || num%7 == 0){
            return true;
        }else{
            return false;
        }
    }
}

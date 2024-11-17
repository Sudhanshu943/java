import java.util.Scanner;

public class InputSum {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        // int sum = 0;
        // while(true){
        //     Scanner sc = new Scanner(System.in);
        //     int num = sc.nextInt();
        //     if (num == 0 ){
        //         break;
        //     }
        //     sum+=num;
        // }
        // System.out.println(sum);
     
        // Find largest Number form all numbers

        int max = Integer.MIN_VALUE;
        Scanner sc =new Scanner(System.in);
        while (true) { 
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(max < num){
                max = num;
            }
        }
        System.out.println("Largest number is "+max);
    }
}

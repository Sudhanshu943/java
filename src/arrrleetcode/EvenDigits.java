package arrrleetcode;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findNumbers(nums));
    }


    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

// Checks if the number of digits is even or not 
    static boolean even(int num){
        int numberOfDigits = digits(num); 
        return numberOfDigits % 2 == 0;

    }

// checks the digits in the number
    static int digits(int num){
        int count = 0;
        // if number is negative
        if(num <0){
            num = num * -1;
        }
        // if number is equals to 0
        if (num == 0) {
            return 1;
        }

        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}

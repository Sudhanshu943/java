package leetcodeSolutions;

import java.util.Arrays;

public class SmallerNumArr {
    public static void main(String[] args) {
        int[] nums = {3,54,2,6};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length;j++) {
            if (j!=i && nums[j]<nums[i]) {
                count++;
            }                
        }
        arr[i] = count;    
        }
        return arr;
    }
}   

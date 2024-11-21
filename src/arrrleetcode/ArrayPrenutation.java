package arrrleetcode;

import java.util.Arrays;

//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

// A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

public class ArrayPrenutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
    //  System.out.println(Arrays.toString(buildArray(nums)));   
     System.out.println(Arrays.toString(buildArray2(nums)));   
    }

    // static int[] buildArray(int[] nums) {
    //     int[] ans = new int[nums.length];
    //     for (int i = 0; i <= nums.length-1; i++) {
    //         ans[i] = nums[nums[i]];
    //     }
    //     return ans;
    // }
    
    static void build(int i ,int[] nums) {
        if (i == nums.length) return;
        
        int temp = nums[nums[i]];
        build(i+1, nums);
        nums[i] = temp;
        
    }

    static int[] buildArray2(int[] nums) {
        build(0, nums);
        return nums;
    }
}

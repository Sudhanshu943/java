package leetcodeSolutions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1,5,6,7,4};
        int target = 9;
     System.out.println(Arrays.toString(twoSum(nums, target)));   
    }

    static int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[2];
        for(int i = 1; i < nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if (nums[j] + nums[j-i] == target) {
                    // ans[0] = j-i;
                    // ans[1] = j;
                    return new int[] {j-i,j};
                }
            }
        }
        
        return new int[] {};
    }
}

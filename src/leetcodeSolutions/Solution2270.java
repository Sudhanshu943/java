package leetcodeSolutions;

import org.jetbrains.annotations.NotNull;

class Solution2270C{
    public int waysToSplitArray(@NotNull int[] nums) {
        long rightSideSum = 0;
        long leftSideSum = 0;
        for(int num : nums){
            rightSideSum += num;
        }

        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            leftSideSum += nums[i];
            rightSideSum -= nums[i];
            if(leftSideSum >= rightSideSum){
                count++;
            }
        }
        return count;
    }
}

public class Solution2270 {
    public static void main(String[] args) {
        Solution2270C solution = new Solution2270C();
        int[] nums = {0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        System.out.println(solution.waysToSplitArray(nums));

    }
}

package arrrleetcode;

import java.util.Arrays;

public class ArrConcantation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(getConcatenation(nums)));   
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}

package arrrleetcode;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int [] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[(2*i) + 1 ] = nums[i+n];
        }
        return ans;
    }
}
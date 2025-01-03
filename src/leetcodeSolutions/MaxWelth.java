package leetcodeSolutions;

public class MaxWelth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3,4},{5,6,7,8}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account1 : accounts) {
            int sum = 0;
            for (int account = 0; account < account1.length; account++) {
                sum = sum + account1[account];
            }
            if(sum>ans){
                ans = sum;
            }
        }        
        return ans;
    }
}

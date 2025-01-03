package leetcodeSolutions;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {12,34,56,53,45,33,35,8,54,45,41};
        System.out.println(minNum(arr));
        System.out.println(maxNum(arr));
    }

    static int minNum(int[] arr){
        int ans  = arr[0];
        for(int i = 1;i < arr.length;i++)
        {
            if (arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    static int maxNum(int[] arr){
        int ans  = arr[0];
        for(int i = 1;i < arr.length;i++)
        {
            if (arr[i]>ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    
}

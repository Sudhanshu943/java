package leetcodeSolutions;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {12,34,56,53,45,323,35,82,54,45,41};
        int target = 45;
        System.out.println(linearSearch(arr, target, 3, 9));
    }

    static int linearSearch(int[] arr, int target, int start,int end ){
        if (arr.length == 0){
            return -1;
        }
        for(int index = start;index <= end; index ++){
            int element  =arr[index];
            if (element == target ) {
                return index;
            }
        }
        return -1;
        
    }
}

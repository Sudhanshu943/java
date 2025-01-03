package code.preactic;


public class Practic {
    public static void main(String[] args) {
        // int [] num = {23,45,67,34,34,56,43,38};
        // int sum = 0;
        // for (int i = 0; i < num.length; i++) {
        //     sum = sum + num[i];
        // }
        // System.out.println(sum);
        // System.out.println(Arrays.toString(num));

        // int [][] arr1 = {{1,2,3},{4,5,6}};
        // int [][] arr2 = {{12,23,43},{45,55,76}};
        // int [][] result = {{0,0,0},{0,0,0}};
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1[i].length; j++) {
        //         result[i][j] = arr1[i][j]+arr2[i][j];
        //         System.out.print(result[i][j] +" ");
        //     }
        //     System.out.println();
        // }

        int [] arr = {2,3,4,5,6};
        for(int i = (arr.length - 1); i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}

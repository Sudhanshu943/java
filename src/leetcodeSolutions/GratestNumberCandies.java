package leetcodeSolutions;

import java.util.ArrayList;

public class GratestNumberCandies {
    public static void main(String[] args){
        int[] candies = {3,4,8,1,5};
        int extraCandies = 4;

       ArrayList<Boolean> ans = kidsWithCandies(candies, extraCandies);
       System.out.println(ans);
    }

    static ArrayList<Boolean>  kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>list=new ArrayList<>();
        for(int i = 0;i<candies.length ;i++){
            if(candies[i] + extraCandies >= maxCandie(candies) ){
                            list.add(true);
                        }else{
                            list.add(false);
                        }
                    }
            return list;
        }
            
    static int maxCandie(int[] candies){
        int max = candies[0];
        for (int i =1; i<candies.length;i++) {
            if (candies[i]> max){
                max = candies[i];
            }
        }
        return max;
    }
}

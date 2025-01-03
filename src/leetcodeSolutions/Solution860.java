package leetcodeSolutions;

class Solution860C {
    public boolean lemonadeChange(int[] bills) {
        int fiveBills = 0;
        int tenBills = 0;
        for(int num : bills){
            if(num == 5) fiveBills++;
            else if(num == 10){
                if(fiveBills == 0)return false;
                else fiveBills--;
                tenBills++;
            }else{
                if(fiveBills == 0 || fiveBills < 3 && tenBills == 0)return false;
                else{
                    if(tenBills == 0) fiveBills -= 3;
                    else {
                        tenBills--;
                        fiveBills--;
                    }
                }
            }
        }
        return true;
    }
}
public class Solution860 {
    public static void main(String[] args) {
        Solution860C solution  = new Solution860C();
        int[] arr = {
            5, 5, 5, 10, 20
        };
        System.out.println(solution.lemonadeChange(arr));
    }
}

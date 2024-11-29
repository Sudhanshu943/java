public class NeonNumber {
    public static void main(String[] args) {
        neonNum(9);
    }
    static void  neonNum(int num){
        int sqr = num * num;
        int sum = 0;
        while (sqr != 0){
            sum += sqr%10;
            sqr = sqr/10;
        }
        if(sum == num){
            System.out.format("This number %d is a neon number",num );
        }else{
            System.out.println("This is not neon number.");
        }
        // return num;
    }

}
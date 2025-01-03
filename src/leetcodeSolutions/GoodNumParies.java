package leetcodeSolutions;

public class GoodNumParies {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    static int mySqrt(int x) {
        
        double sqr = Math.pow(x,0.5);
        return (int) sqr;
    }

}

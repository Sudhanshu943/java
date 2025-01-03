public class GussGame {
    public static void main(String[] args) {
     System.out.println(guessNumber(5));   
    }

    static int guessNumber(int n) {
        int start = 0;
        int end = n;

        while (start<=end){
            int mid = start +(end - start)/2;

            int g = guess(mid);

            switch (g) {
                case 1 -> start = mid +1;
                case -1 -> end = mid - 1;
                default -> {
                    return mid;
                }
            }
        }

        return 1;        
    }

    static int guess(int n){
        int random = (int) (Math.random() * n);
        return random;
    }
}

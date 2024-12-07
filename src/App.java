import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 1;
        while (i<=10) {
            int result = N * i;
            System.out.format("%d x %d = %d\n",N ,i , result);
            i++;
        }

        bufferedReader.close();
    }
}

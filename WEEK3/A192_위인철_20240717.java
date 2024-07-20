import java.util.Scanner;

public class A192_위인철_20240129 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
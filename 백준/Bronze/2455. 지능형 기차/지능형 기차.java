import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[][] = new int[4][2];
        int now = 0;
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < 2; j++) {
                num[i][j] = s.nextInt();
                if (j == 1) {
                    now += num[i][j];
                } else if (j == 0) {
                    now -= num[i][j];
                }

                if (now > max) {
                    max = now;
                }
            }
        }
        System.out.println(max);
    }
}

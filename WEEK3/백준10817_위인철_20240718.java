import java.util.Arrays;
import java.util.Scanner;

public class 백준10817_위인철_20240202 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = s.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[1]);
    }
}

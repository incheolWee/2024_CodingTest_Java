import java.util.Scanner;

public class A019_위인철_20240115 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int A = s.nextInt();
            int B = s.nextInt();
            int C = s.nextInt();

            int num[] = new int[10];
            String result = A * B * C + "";
            for (int i = 0; i < result.length(); i++) {
                num[result.charAt(i) - '0']++;
            }
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
            }
        }
    }
}

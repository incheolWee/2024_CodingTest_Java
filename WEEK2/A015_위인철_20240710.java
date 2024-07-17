import java.util.Scanner;

public class A015_위인철_20240123 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int num[] = new int[5];
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                num[i] = s.nextInt();
                sum += Math.pow(num[i], 2);
            }
            sum %= 10;
            System.out.println(sum);
        }

    }

}
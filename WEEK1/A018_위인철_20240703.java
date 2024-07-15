import java.util.Scanner;
import java.util.Arrays;

public class A018_위인철_20240114 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();

        int num_A[] = new int[input];
        int num_B[] = new int[input];

        // A 입력
        for (int i = 0; i < input; i++) {
            num_A[i] = s.nextInt();
        }
        // B 입력
        for (int i = 0; i < input; i++) {
            num_B[i] = s.nextInt();
        }
        Arrays.sort(num_A);
        Arrays.sort(num_B);
        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum += num_A[i] * num_B[input - i - 1];
        }
        System.out.println(sum);
        s.close();
    }
}

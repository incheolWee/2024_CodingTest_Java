import java.util.Scanner;

public class Main {
    public static void main(String angs[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int num[] = new int[N];
        long max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            num[i] = s.nextInt();
            if (max < num[i]) {
                max = num[i];
            }
        }
        for (int i = 0; i < N; i++) {
            sum += num[i];
        }

        System.out.println(sum * 100.0 / N / max);


    }
}

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public interface Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int num[] = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = s.nextInt();
        }
        Arrays.sort(num);
        System.out.print(num[0] + " " + num[N - 1]);

    }
}

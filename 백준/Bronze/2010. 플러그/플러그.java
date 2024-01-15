import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int count = s.nextInt();
            int num[] = new int[count];
            int sum = 0;
            for (int i = 0; i < count; i++) {
                num[i] = s.nextInt();
                sum += num[i];
            }
            int result = sum - (count - 1);
            System.out.println(result);
        }

    }
}

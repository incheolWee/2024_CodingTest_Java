import java.util.Scanner;

public class Main {
    static int N;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        int result = coin(N);
        System.out.println(result);
    }

    public static int coin(int N) {
        if (N == 1 || N == 3)
            return -1;

        if (N % 5 == 0) {
            return N / 5;
        } else if (N % 5 == 1 || N % 5 == 3) {
            int a = (N / 5) - 1;
            int b = (N % 5) + 5;
            return a + (b / 2);
        } else if (N % 5 == 2 || N % 5 == 4) {
            return (N / 5) + (N % 5) / 2;

        }
        return N / 2;
    }
}

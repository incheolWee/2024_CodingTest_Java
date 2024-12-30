import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] combination;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        M = s.nextInt();
        combination = new int[M];
        backtrack(1, 0);
    }

    public static void backtrack(int start, int depth) {
        if (depth == M) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N; i++) {
            combination[depth] = i;
            backtrack(i + 1, depth + 1);
        }
    }
}

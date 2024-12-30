

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int triangle[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = s.nextInt();
            }
        }

        int[][] dp = new int[N][N];
        dp[0][0] = triangle[0][0];

        // DP로 누적 최대 합 계산
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // 왼쪽 가장자리
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if (j == i) {
                    // 오른쪽 가장자리
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    // 중간 값
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }

        // 마지막 행에서 최대값 찾기
        int result = 0;
        for (int j = 0; j < N; j++) {
            result = Math.max(result, dp[N - 1][j]);
        }

        System.out.println(result);
    }
}

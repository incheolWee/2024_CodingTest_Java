import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        long S[] = new long[N];
        long C[] = new long[M];
        long answer = 0;

        // Step 1. 값을 입력 받는다 => 합배열로 저장
        S[0] = s.nextInt();
        // 수열의 합 배열 만들기
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + s.nextInt();
        }
        // Step 2. 합배열에서 나누어 떨어 지는 갯수를 확인한다.
        for (int i = 0; i < N; i++) {
            // 합 배열의 모든 값에 % 연산 수행하기
            int remainder = (int) (S[i] % M);
            // 0~i 까지의 구간합 자체가 0일때 정답 더하기
            if (remainder == 0)
                answer++;
            // 나머지가 값은 인뎃스의 개수 카운팅 하기
            C[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
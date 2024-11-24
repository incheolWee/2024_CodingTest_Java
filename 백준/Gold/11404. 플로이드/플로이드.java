import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        final int INF = 10000000; // 충분히 큰 값으로 설정

        int N = s.nextInt(); // 도시 수
        int M = s.nextInt(); // 버스 노선 수

        int[][] dist = new int[N + 1][N + 1];
        
        // 거리 배열 초기화
        for (int i = 1; i <= N; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0; // 자기 자신으로 가는 거리는 0
        }

        // 입력 처리
        for (int i = 0; i < M; i++) {
            int start = s.nextInt();
            int end = s.nextInt();
            int cost = s.nextInt();
            dist[start][end] = Math.min(dist[start][end], cost); // 최소 비용 갱신
        }

        // 플로이드-워셜 알고리즘
        for (int k = 1; k <= N; k++) { // 경유지
            for (int i = 1; i <= N; i++) { // 출발지
                for (int j = 1; j <= N; j++) { // 도착지
                    if (dist[i][k] != INF && dist[k][j] != INF) { // 경유지를 거쳐 갈 수 있는 경우
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("0 "); // 도달할 수 없는 경우
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }

        s.close();
    }
}
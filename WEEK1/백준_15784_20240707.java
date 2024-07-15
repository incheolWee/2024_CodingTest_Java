import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class 백준_15784_20240118 {
    public static void main(String arg[]) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(s.readLine());

        int N = Integer.parseInt(st.nextToken());
        int what_row = Integer.parseInt(st.nextToken());
        int what_col = Integer.parseInt(st.nextToken());
        int sit[][] = new int[N][N];
        // 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sit[i][j] = Integer.parseInt((st.nextToken()));
            }
        }
        // 진서 num
        int target = sit[what_row - 1][what_col - 1];
        boolean isAngry = false;
        // search_row
        for (int i = 0; i < 5; i++) {
            if (target < sit[what_row - 1][i]) {
                isAngry = true;
                break;
            }
        }
        // search_col
        if (isAngry == false) {
            for (int i = 0; i < 5; i++) {
                if (target < sit[i][what_col - 1]) {
                    isAngry = true;
                    break;
                }
            }
        }

        if (isAngry) {
            System.out.println("ANGRY");
        } else {
            System.out.println("HAPPY");
        }
    }
}

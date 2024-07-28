import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준1032_위인철_02040210
 */
public class 백준1032_위인철_02040210 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        String input[] = new String[N];
        // 넣고
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            input[i] = st.nextToken();
        }

        for (int i = 0; i < N; i++) {
            char c = input[0].charAt(i);
            boolean same = true;
            for (int j = 1; j < N; j++) {
                if (c != input[j].charAt(i)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                sb.append(c);
            } else {
                sb.append('?');
            }
        }
        System.out.println(sb);
    }

}
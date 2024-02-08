import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.print.DocFlavor.INPUT_STREAM;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        String input[] = new String[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int count = 0;
            int result = 0;
            input[i] = st.nextToken();
            for (int j = 0; j < input[i].length(); j++) {
                char c = input[i].charAt(j);
                if (c == 'O') {
                    count++;
                    result += count;
                } else if (c == 'X') {
                    count = 0;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}

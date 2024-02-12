import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line, " ");
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            sb.append(A + B).append("\n");
        }
        System.out.print(sb);
    }

}

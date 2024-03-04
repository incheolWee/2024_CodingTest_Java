import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int num[] = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0, mid, total;
        for (int i = 0; i < num.length; i++) {
            st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());
            sum += num[i];
        }
        Arrays.sort(num);
        mid = num[2];
        System.out.println(sum / num.length);
        System.out.println(mid);

    }
}

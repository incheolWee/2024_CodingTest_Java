import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder();
        if (x > 0 && y > 0) {
            st.append(1);
        } else if (x < 0 && y > 0) {
            st.append(2);
        } else if (x < 0 && y < 0) {
            st.append(3);
        } else {
            st.append(4);
        }
        System.out.println(st);
    }
}

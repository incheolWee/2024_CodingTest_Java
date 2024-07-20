import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A195_위인철_20240202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int star = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star++;
        }
    }
}

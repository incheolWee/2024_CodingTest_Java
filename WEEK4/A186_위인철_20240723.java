import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A186_위인철_20240208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(grade(Integer.parseInt(st.nextToken()))).append("\n");

        System.out.println(sb);
    }

    public static String grade(int a) {
        if (a >= 90)
            return "A";
        else if (a < 90 && a >= 80)
            return "B";
        else if (a < 80 && a >= 70)
            return "C";
        else if (a < 70 && a >= 60)
            return "D";
        else
            return "F";
    }
}

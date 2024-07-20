import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A130_위인철_20240202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0)
                stack.pop();
            else
                stack.push(N);
        }
        int result = 0;
        while (!stack.empty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}

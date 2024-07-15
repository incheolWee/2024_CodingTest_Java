
import java.util.Scanner;

public class A031_위인철_20240115 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int A = s.nextInt();
            int B = s.nextInt();
            int result = (A * B) - 1;
            System.out.println(result);
        }
    }
}

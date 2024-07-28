import java.util.Scanner;

public class 백준10870_위인철_20240218 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(fivonachi(N));
    }

    public static int fivonachi(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fivonachi(n - 1) + fivonachi(n - 2);
    }
}

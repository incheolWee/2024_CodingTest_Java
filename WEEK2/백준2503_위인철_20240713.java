import java.util.Scanner;

public class 백준2503_위인철_20240124 {
    class Number {
        int input;
        int st;
        int ball;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Number number[] = new Number[N];
        for (int i = 0; i < N; i++) {
            number[i].input = s.nextInt();
            number[i].st = s.nextInt();
            number[i].ball = s.nextInt();
        }
        for (int i = 123; i < 1000; i++) {
            String term = Integer.toString(i);
            if (term.charAt(0) == '0' || term.charAt(1) == '0' || term.charAt(2) == '0')
                continue;

        }

    }
}

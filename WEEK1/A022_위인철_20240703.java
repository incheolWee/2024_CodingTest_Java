import java.util.Scanner;

public class A022_위인철_20240115 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            int count = s.nextInt();
            int num[] = new int[count];
            int M = 0; // 민식 60초마다 15
            int Y = 0; // 영식 30초마다 10
            for (int i = 0; i < count; i++) {
                num[i] = s.nextInt();
                M += ((num[i] / 60) + 1) * 15;
                Y += ((num[i] / 30) + 1) * 10;
            }

            if (M == Y) {
                System.out.println("Y M " + M);
            } else if (M > Y) {
                System.out.println("Y " + Y);
            } else if (M < Y) {
                System.out.println("M " + M);
            }

        }

    }
}

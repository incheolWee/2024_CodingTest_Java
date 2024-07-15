import java.util.Scanner;

public class 백준_2750_위인철_20240115 {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int input = s.nextInt();
            int num[] = new int[input];
            // 입력 받기
            for (int i = 0; i < input; i++) {
                num[i] = s.nextInt();
            }
            // 버블 정렬
            for (int i = 0; i < input - 1; i++) {

                for (int j = 0; j < input - i - 1; j++) {
                    if (num[j] > num[j + 1]) {
                        // swap 사용
                        int term = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = term;
                    }
                }
            }
            for (int i = 0; i < input; i++) {
                System.out.println(num[i]);
            }
        }
    }

}

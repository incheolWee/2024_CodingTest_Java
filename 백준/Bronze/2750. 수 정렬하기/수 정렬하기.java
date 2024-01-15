import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
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

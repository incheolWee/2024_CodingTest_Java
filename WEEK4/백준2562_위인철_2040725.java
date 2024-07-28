import java.util.Scanner;

public class 백준2562_위인철_20240211 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num[] = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            num[i] = s.nextInt();
            if (max < num[i]) {
                max = num[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

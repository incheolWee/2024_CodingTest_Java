import java.util.Scanner;

public class Main {
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

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num[][] = new int[5][4];
        int index = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            int point = 0;
            for (int j = 0; j < 4; j++) {
                num[i][j] = s.nextInt();
                point += num[i][j];
            }
            if (max < point) {
                max = point;
                index = i + 1;
            }
        }
        System.out.println(index + " " + max);
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int star = 1;
        int black = N - 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < black; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
            black--;
            star += 2;
        }
        black++;
        star -= 2;
        for (int i = 0; i < N - 1; i++) {
            black++;
            star -= 2;
            for (int j = 0; j < black; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

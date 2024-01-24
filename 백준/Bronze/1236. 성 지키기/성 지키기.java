import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        char num[][] = new char[row][col];
        int count_row = 0, count_col = 0;

        // 입력
        for (int i = 0; i < row; i++) {
            String term = s.next();
            for (int j = 0; j < col; j++) {
                num[i][j] = term.charAt(j);
            }
        }
        for (int i = 0; i < row; i++) {
            boolean T = true;
            for (int j = 0; j < col; j++) {
                if (num[i][j] == 'X') {
                    T = false;
                    break;
                }
            }
            if (T) {
                count_row++;
            }
        }
        for (int i = 0; i < col; i++) {
            boolean T = true;
            for (int j = 0; j < row; j++) {
                if (num[j][i] == 'X') {
                    T = false;
                    break;
                }
            }
            if (T) {
                count_col++;
            }
        }
        System.out.println(Math.max(count_row, count_col));
    }
}

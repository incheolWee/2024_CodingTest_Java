import java.util.Scanner;

public class 백준11720_위인철_20240126 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String sNum = s.next();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += sNum.charAt(i) - '0';
        }
        System.out.println(sum);
    }

}

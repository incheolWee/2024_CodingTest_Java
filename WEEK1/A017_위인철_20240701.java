import java.util.Arrays;
import java.util.Scanner;

public class A017_위인철_20240114 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String input = s.nextLine();
            int arr[] = new int[10];

            for (int i = 0; i < input.length(); i++) {
                int num = input.charAt(i) - '0';
                if (num == 9) {
                    num = 6;
                }
                arr[num]++;
            }
            arr[6] = (arr[6] % 2) + (arr[6] / 2);
            Arrays.sort(arr);
            System.out.println(arr[9]);
        }
    }
}

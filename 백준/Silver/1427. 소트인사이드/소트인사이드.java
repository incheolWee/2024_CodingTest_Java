import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        int A[] = new int[str.length()];
        // 배열 넣고
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        // 선택 sort
        for (int i = 0; i < str.length(); i++) {
            int Max = i;
            for (int j = i + 1; j < str.length(); j++) {
                if (A[j] > A[Max]) {
                    Max = j;
                }
            }
            if (A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }

}

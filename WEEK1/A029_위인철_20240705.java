
import java.util.Scanner;

public class A029_위인철_20240115 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            // 입력
            long num = s.nextLong(); // 롱으로 입력 하여 inputMatch 안뜨게 하기
            int open = s.nextInt();
            // 탈출

            if (num >= 6) {
                System.out.println("Love is open door");
            } else {
                for (int i = 0; i < num - 1; i++) {
                    if (open == 0) {
                        open = 1;
                        System.out.println(open);
                    } else if (open == 1) {
                        open = 0;
                        System.out.println(open);
                    }

                }
            }

        }
    }
}

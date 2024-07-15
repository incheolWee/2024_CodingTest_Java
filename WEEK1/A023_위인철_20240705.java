import java.util.Scanner;

public class A023_위인철_20240115 {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        else if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}

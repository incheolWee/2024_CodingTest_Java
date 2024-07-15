import java.math.BigInteger;
import java.util.Scanner;

public class A028_위인철_20240115 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger A = s.nextBigInteger();
        BigInteger B = s.nextBigInteger();
        BigInteger result = A.add(B);
        System.out.println(result);
    }
}

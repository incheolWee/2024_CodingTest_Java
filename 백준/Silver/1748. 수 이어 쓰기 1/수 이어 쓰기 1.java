import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();

        long length = 0; 
        long start = 1; 
        int digit = 1;

        while (start <= N) {
            long end = start * 10 - 1; 
            length += (Math.min(N, end) - start + 1) * digit;
            start *= 10;
            digit++; 
        }

        System.out.println(length);
    }
}

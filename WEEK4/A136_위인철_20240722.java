import java.io.*;

public class A136_위인철_20240208 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb.append(br.readLine());
        String find = br.readLine();

        search(find);

    } // End of main

    static void search(String find) {

        int count = 0;
        int startIndex = 0;
        int find_len = find.length();

        while ((startIndex = sb.toString().indexOf(find)) != -1) {
            sb.delete(0, startIndex + find_len);
            count++;
        }

        System.out.println(count);
    }
}

public class A176_위인철_20240201 {

    public int solution(int n) {
        int answer = 0;

        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                answer = x;
                break;
            }
            answer = x;

        }
        return answer;
    }

}

public class A170_위인철_20240207 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }
        if (answer < money) {
            return 0;
        }
        return answer - money;
    }
}

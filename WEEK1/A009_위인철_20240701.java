
class A009_위인철_20240114 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }

        } else {
            answer = false;
        }

        return answer;
    }
}

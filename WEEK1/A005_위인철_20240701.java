class A005_위인철_20240112 {
    boolean solution(String s) {
        boolean answer = true;

        int count_P = 0;
        int count_Y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                count_P++;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                count_Y++;
            }
        }

        if (count_P != count_Y) {
            answer = false;
        }

        return answer;
    }
}
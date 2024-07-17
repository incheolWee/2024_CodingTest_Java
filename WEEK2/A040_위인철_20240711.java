public class A040_위인철_20240123 {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int length = s.length() / 2;
        String a = s.substring(0, length), b = s.substring(length);
        int count_a = 0, count_b = 0;
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                count_a++;
            }
            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o'
                    || b.charAt(i) == 'u') {
                count_b++;
            }
        }
        return count_a == count_b;
    }

}

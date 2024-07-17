public class A115_위인철_20240125 {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        int balloon[] = new int[5];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                balloon[0]++;
            } else if (text.charAt(i) == 'a') {
                balloon[1]++;
            } else if (text.charAt(i) == 'l') {
                balloon[2]++;
            } else if (text.charAt(i) == 'o') {
                balloon[3]++;
            } else if (text.charAt(i) == 'n') {
                balloon[4]++;
            }
        }
        balloon[2] /= 2;
        balloon[3] /= 2;
        int min = balloon[0];
        for (int i = 0; i < balloon.length; i++) {
            if (min > balloon[i]) {
                min = balloon[i];
            }
        }
        return min;
    }
}
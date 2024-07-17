public class A039_위인철_20240123 {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int sqrt = (int) (Math.sqrt(num));
            if (Math.pow(sqrt, 2) == num) {
                return true;
            } else {
                return false;
            }

        }
    }
}

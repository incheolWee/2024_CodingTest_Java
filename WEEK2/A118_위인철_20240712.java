public class A118_위인철_20240126 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[count] = nums[i];
                    count++;
                }
            }
            for (int k = count; k < n; k++) {
                nums[k] = 0;
            }
        }
    }
}

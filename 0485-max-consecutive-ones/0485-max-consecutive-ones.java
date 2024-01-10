class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
            }
            else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max)
            max = count;
        return max;
    }
}
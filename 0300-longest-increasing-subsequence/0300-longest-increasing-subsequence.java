class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] stack = new int[nums.length];
        int len = 1;
        stack[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > stack[len - 1]) {
                stack[len++] = nums[i];
            } else {
                // Binary search to find the position to update
                int left = 0, right = len - 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (stack[mid] < nums[i]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                stack[left] = nums[i];
            }
        }

        return len;
    }
}
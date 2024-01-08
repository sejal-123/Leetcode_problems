class Solution {
    public boolean check(int[] nums) {
        int temp = 0;
        int max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                temp++;
            }
        }
        if (temp == 0)
            return true;
        else if (temp > 1) {
            return false;
        }
        else if (nums[0] < nums[nums.length-1])
            return false;
        return true;
    }
}
class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length-1; i++) {
            int j = i+1;
            while(j < nums.length) {
                if (nums[i] < nums[j]){
                    if (max < (nums[j] - nums[i]))
                        max = nums[j] - nums[i];
                }
                j++;
            }
        }
        return max;
    }
}
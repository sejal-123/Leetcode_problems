class Solution {
    public int[] twoSum(int[] nums, int target) {
        int dup[] = nums;
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] + nums[i] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        if (nums[mid] > target) {
            int i = 0;
            while(i < mid) {
                if (nums[i] == target)
                    return i;
                i++;
            }
        } else {
            int i = mid;
            while (i < nums.length) {
                if (nums[i] == target) 
                    return i;
                i++;
            }
        }
        return -1;
    }
}
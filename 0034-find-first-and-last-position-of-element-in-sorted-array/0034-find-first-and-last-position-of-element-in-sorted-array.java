class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        int i = 0, j = nums.length-1;
        while (i < nums.length) {
            if (nums[i] == target) {
               ans[0] = i;
                break;
            }
            i++;
        }
        while (j > -1 ) {
            if (nums[j] == target) {
                ans[1] = j;
                break;
            }
            j--;
        }
        return ans;
    }
}
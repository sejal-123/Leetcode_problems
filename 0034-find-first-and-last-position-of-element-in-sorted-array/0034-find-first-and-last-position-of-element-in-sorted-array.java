class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        int i = 0, j = nums.length-1, found1 = 0, found2 = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
               ans[0] = i;
                System.out.println(i);
                break;
            }
            i++;
        }
        while (j > -1 ) {
            if (nums[j] == target) {
                System.out.println(j);
                ans[1] = j;
                break;
            }
            j--;
        }
        return ans;
    }
}
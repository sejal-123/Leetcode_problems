class Solution {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        if (nums.length < 3) {
            return 0;
        } else if (nums.length == 3) {
            if (nums[0] != nums [1] && nums[1] != nums[2] && nums[0] != nums[2])
                return 1;
            else 
                return 0;
        }
        for (int i = 0; i < nums.length-2; i++) {
            int j = i + 1;
            int k = i + 2;
            while (j < nums.length-1) {
                if (nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]) {
                    count++;
                    k++;
                }
                else if(nums[i] == nums[k] || nums[j] == nums[k]) {
                    k++;
                    // System.out.println(nums[j]);
                }
                else if (nums[i] == nums[j]) {
                    j++;
                    k = j+1;
                } 
                if (k > nums.length - 1) {
                    j++;
                    k = j + 1;
                }
            }
        }
        return count;
    }
}
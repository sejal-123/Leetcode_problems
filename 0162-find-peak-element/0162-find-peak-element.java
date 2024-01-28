class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        else if (nums[0] > nums[1]) 
            return 0;
        else if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;
        else {
            int low = 1, high = nums.length - 2;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                    return mid;
                else if (nums[mid] > nums[mid + 1])
                    high = mid -1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
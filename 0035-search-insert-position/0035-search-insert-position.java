class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while(i < j) {
            int mid = (i+j) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                j = mid;
            } else {
                i = mid+1;
            }
        }
        System.out.println(i +  " "+ j);
        if (nums[i] < target) 
            return i+1;
        else
            return i;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int i = 0, min = 0;
        if (nums[0] <= nums[nums.length-1])
            min = 0;
        while(i < nums.length-1) {
            if (nums[i] > nums[i+1]) {
                min = i+1;
                break;
            }
            else
                i++;
        }
        if (nums[min] == target) {
            return min;
        }
        else if (nums[min] < target && target <= nums[nums.length-1]) {
            int arr[] = new int[nums.length - min];
            for (int j = min+1; j < nums.length; j++) {
                arr[j-min-1] = nums[j];
            }
            int ans = binarySearch(arr, target);
            if (ans == -1)
                return -1;
            return min + binarySearch(arr, target) + 1;
        }
        else{
            int arr[] = new int[min];
            for (int j = 0; j < min; j++) {
                arr[j] = nums[j];
            }
            return binarySearch(arr, target);
        }  
    }

    public int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid-1;
        }
        return -1;
    }
}
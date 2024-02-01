class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, sl = matrix[0].length-1;
        while (i < matrix.length) {
            if (matrix[i][0] <= target && matrix[i][sl] >= target) {
                return binarySearch(matrix[i], target);
            }
            else if (matrix[i][0] == target)
                return true;
            else
                i++;
        }
        return false;
    }

    public boolean binarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return false;
    }
}
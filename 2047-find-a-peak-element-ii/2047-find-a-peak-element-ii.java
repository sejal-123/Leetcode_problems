class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int arr[] = {-1, -1};
        int low = 0, high = mat[0].length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            int rowIndex = findRowIndex(mat, mid);
            int left = mid - 1 >=0 ? mat[rowIndex][mid-1] : -1;
            int right = mid+1 < mat[0].length ? mat[rowIndex][mid+1] : -1;
            if (mat[rowIndex][mid] > left && mat[rowIndex][mid] > right) {
                arr[0] = rowIndex;
                arr[1] = mid;
                return arr;
            }
            else if (mat[rowIndex][mid] < left)
                high = mid-1;
            else low = mid+1;
        }
        return arr;
    }

    public int findRowIndex (int[][] mat, int index) {
        int max = -1, ind = -1;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][index] > max) {
                max = mat[i][index];
                ind = i;
            }
        }
        return ind;
    }
}
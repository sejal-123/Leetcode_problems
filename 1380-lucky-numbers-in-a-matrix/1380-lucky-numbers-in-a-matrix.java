class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int arr[] = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int ele: matrix[i]) {
                if (ele < min)
                    min = ele;
            }
            arr[i] = min;
        }
        int i = 0;
        while (i < arr.length) {
            int ind = index(matrix[i], arr[i]);
            for (int j = 0; j < matrix.length; j++) {
                if (arr[i] < matrix[j][ind])
                    break;
                if (j == matrix.length-1)
                    ans.add(arr[i]);
            }
            i++;
        }
        return ans;
    }

    public int index(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        int count = 0;
        for (int k = 0; k < indices.length; k++) {
            int index = indices[k][0];
            for (int j = 0; j < n; j++) {
                arr[index][j] = arr[index][j] + 1;
            }
            index = indices[k][1];
            for (int i = 0; i < m; i++) {
                arr[i][index] = arr[i][index] + 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 1)
                    count+= 1;
            }
        }
        return count;
    }
}
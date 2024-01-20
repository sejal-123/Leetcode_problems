class Solution {
    public void rotate(int[][] matrix) {
        int transpose[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int arr[] = new int[matrix[i].length];
            for (int j = matrix.length-1; j >= 0; j--)
            {
                arr[matrix.length-1 - j] = transpose[i][j];
            }
            matrix[i] = arr;
        }
    }
}

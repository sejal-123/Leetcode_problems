class Solution {
    public void rotate(int[][] matrix) {
        // int transpose[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int arr[] = new int[matrix[i].length];
            for (int j = matrix.length-1; j >= 0; j--)
            {
                arr[matrix.length-1 - j] = matrix[i][j];
            }
            matrix[i] = arr;
        }
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int total = matrix.length * matrix[0].length;
        List<Integer> lst = new ArrayList<>();
        int col = matrix[0].length, row = matrix.length;
        int sc = 0, sr = 0;
        while (sc < col && sr < row) {
            for (int i = sc; i < col; i++) {
                lst.add(matrix[sr][i]);
            }
            sr++;
            for (int i = sr; i < row; i++) {
                lst.add(matrix[i][col-1]);
            }
            col--;
            if (sr < row) {
                for (int i = col-1; i >= sc; i--) {
                    lst.add(matrix[row-1][i]);
                }
                row--;
            }
            if (sc < col) {
                for (int i = row-1; i >= sr; i--) {
                    lst.add(matrix[i][sc]); 
                }
                sc++;
            }
        }
        return lst;
    }
}
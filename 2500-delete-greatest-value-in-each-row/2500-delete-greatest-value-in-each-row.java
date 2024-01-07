class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i = grid[0].length-1; i >= 0; i--) {
            int max = 0;
            for (int[] ele: grid) {
                if (max < ele[i])
                    max = ele[i];
            }
            count += max;
        }
        return count;

    }
}
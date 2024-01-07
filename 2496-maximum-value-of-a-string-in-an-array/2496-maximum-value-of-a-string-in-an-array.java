class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
        try {
            int d = Integer.parseInt(strs[i]);
            if (max < d)
                max = d;
        } catch (NumberFormatException nfe) {
            if (max < strs[i].length()) 
                max = strs[i].length();
        }
        }
        return max;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minLengthWord = strs[0];
        for (String s: strs) {
            while (s.indexOf(minLengthWord) != 0) {
                minLengthWord = minLengthWord.substring(0, minLengthWord.length() - 1);
            }
        }
        return minLengthWord;
    }
}
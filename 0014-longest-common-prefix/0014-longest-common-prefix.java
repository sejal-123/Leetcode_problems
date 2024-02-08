class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minLengthWord = strs[0];
        while (minLengthWord.length() > 0) {
            for (String s: strs) {
                if (s.indexOf(minLengthWord) != 0) {
                    break;
                }
                if (s.equals(strs[strs.length - 1]))
                    return minLengthWord;
            }
            minLengthWord = minLengthWord.substring(0, minLengthWord.length() - 1);
        }
        return "";
    }
}
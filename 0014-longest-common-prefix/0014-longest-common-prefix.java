class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String minLengthWord = strs[0];
        while (minLengthWord.length() > 0) {
            for (String s: strs) {
                if (s.indexOf(minLengthWord) != 0) {
                    break;
                }
                if (s.equals(strs[strs.length - 1]))
                    return minLengthWord;
            }
            String temp = "";
            for (int i = 0; i < minLengthWord.length() - 1; i++) {
                temp += minLengthWord.charAt(i);
            }
            minLengthWord = temp;
        }
        return "";
    }
}
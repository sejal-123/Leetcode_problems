class Solution {
    public boolean backspaceCompare(String s, String t) {
        return sb(s).equals(sb(t));
    }

    public String sb(String s) {
        StringBuilder s1 = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (ch != '#') {
                s1.append(ch);
            } else if (s1.length() != 0) {
                s1.deleteCharAt(s1.length() - 1);
            }
        }
        return s1.toString();
    }
}
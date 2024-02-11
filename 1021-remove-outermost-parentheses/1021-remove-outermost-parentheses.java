class Solution {
    public String removeOuterParentheses(String s) {
        String sb = "";
        int opened = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (opened > 0)
                    sb += "(";
                opened++;
            }
            if (s.charAt(i) == ')') {
                if (opened > 1)
                    sb+=')';
                opened--;
            }
        }
        return sb;
    }
}
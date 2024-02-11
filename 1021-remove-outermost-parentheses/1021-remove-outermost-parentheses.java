class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (opened > 0)
                    sb.append('(');
                opened++;
            }
            if (s.charAt(i) == ')') {
                if (opened > 1)
                    sb.append(')');
                opened--;
            }
        }
        return sb.toString();
    }
}
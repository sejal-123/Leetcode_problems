class Solution {
    public int maxDepth(String s) {
        int c = 0, tmp = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(')
                tmp++;
            else if (s.charAt(i) == ')') {
                if (tmp > c)
                    c = tmp;
                tmp--;
            }
        }
        return c;
    }
}
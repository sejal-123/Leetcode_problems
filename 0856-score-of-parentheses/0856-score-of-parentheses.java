class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int score = 0, j = 0;
        while(j < s.length()) {
            if (s.charAt(j) == '(') {
                st.push('(');
                j++;
            } else if (!st.isEmpty() && st.peek() == '(') {
                int k = 0;
                while(!st.isEmpty()) {
                    st.pop();
                    k++;
                    score++;
                }
                j = j + k;
            }
        }
        return score;
    }
}
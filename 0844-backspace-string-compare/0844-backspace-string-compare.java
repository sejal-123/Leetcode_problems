class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '#') {
                if (st1.isEmpty()) {
                    continue;
                } 
                else 
                    st1.pop();
            }
            else {
                st1.push(ch);
            }
        }
        for (char ch: t.toCharArray()) {
            if (ch == '#') {
                if (st2.isEmpty()) {
                    continue;
                }
                else
                    st2.pop();
            }
            else 
                st2.push(ch);
        }
        s = ""; t = "";
        while(!st1.isEmpty()) {
            s = st1.pop() + s;
        }
        while(!st2.isEmpty()) {
            t = st2.pop() + t;
        }
        return s.equals(t);
    }
}
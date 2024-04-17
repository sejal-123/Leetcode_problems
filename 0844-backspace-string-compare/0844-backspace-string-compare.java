class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (char ch: s.toCharArray()) {
            System.out.println(ch);
            if (ch == '#') {
                if (st1.isEmpty()) {
                    continue;
                } else 
                System.out.println(st1.pop());
            }
            else {
                System.out.println(ch);
                st1.push(ch);
            }
        }
        System.out.println(st1);
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
        System.out.println(s + " " + t);
        return s.equals(t);
    }
}
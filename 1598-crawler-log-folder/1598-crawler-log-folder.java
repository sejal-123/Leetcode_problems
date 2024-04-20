class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for (String s: logs) {
            if (s.contains("..") && !st.isEmpty()) {
                st.pop();
            } else if (!s.contains(".")) {
                st.push(s);
            }
            System.out.println(st);
        }
        int op = 0;
        while (!st.isEmpty()) {
            st.pop();
            op++;
        }
        return op;
    }
}
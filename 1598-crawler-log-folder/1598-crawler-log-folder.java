class Solution {
    public int minOperations(String[] logs) {
        // Stack<String> st = new Stack<>();
        int op = 0;
        for (String s: logs) {
            if (s.contains("..") && op != 0) {
                // st.pop();
                op--;
            } else if (!s.contains(".")) {
                // st.push(s);
                op++;
            }
        }
        // int op = 0;
        // while (!st.isEmpty()) {
        //     st.pop();
        //     op++;
        // }
        return op;
    }
}
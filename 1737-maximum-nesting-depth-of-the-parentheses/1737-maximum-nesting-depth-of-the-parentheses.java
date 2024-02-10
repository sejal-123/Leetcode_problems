class Solution {
    public int maxDepth(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int c = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(')
                arr.add('(');
            else if (s.charAt(i) == ')') {
                if (arr.size() > c)
                    c = arr.size();
                arr.remove(arr.size() - 1);
            }
        }
        return c;
    }
}
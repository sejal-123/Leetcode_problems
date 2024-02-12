class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Boolean> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (m1.get(s.charAt(i)) == null) {
                if (m2.get(t.charAt(i)) == null) {
                    m1.put(s.charAt(i), t.charAt(i));
                    m2.put(t.charAt(i), true);
                } else if (m2.get(t.charAt(i)) == true) {
                    return false;
                }
            } else {
                if (m1.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
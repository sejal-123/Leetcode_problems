class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char ch1[] = s.toCharArray();
        for (char c : ch1) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        if (sb.toString().equals(sb.reverse().toString()))
            return true;
        return false;
    }
}
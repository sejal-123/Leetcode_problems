class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<String> ch = new ArrayList<>();
        char ch1[] = s.toCharArray();
        for (char c : ch1) {
            if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >= 48 && c <= 57)) {
                ch.add(String.valueOf(c));
            }
        }
        int p = 1, i = 0, j = ch.size() - 1;
        while (i <= j) {
            if (!ch.get(i).toLowerCase().equals(ch.get(j).toLowerCase())) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
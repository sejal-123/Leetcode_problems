class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
       for (String s: words) {
            StringBuilder sb = new StringBuilder(s);
            if (sb.indexOf(pref) == 0)
                c++;
        }
        return c;
    }
}
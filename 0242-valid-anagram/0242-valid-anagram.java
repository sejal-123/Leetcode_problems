class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        if (s.length() != t.length())
            return false;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (new String(ch1).equals(new String(ch2))) 
            return true;
        else
            return false;
    }
}
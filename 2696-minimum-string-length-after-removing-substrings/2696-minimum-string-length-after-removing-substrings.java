class Solution {
    public int minLength(String s) {
        return reduceStringLength(s).length();
    }

    public String reduceStringLength(String s) {
        if (s.contains("AB")) {
            int index = s.indexOf("AB");
            s = s.substring(0, index) + s.substring(index+2, s.length());
            s = reduceStringLength(s);
        }
        if (s.contains("CD")) {
            int index = s.indexOf("CD");
            s = s.substring(0, index) + s.substring(index+2, s.length());
            s = reduceStringLength(s);
        }
        return s;
    }
}
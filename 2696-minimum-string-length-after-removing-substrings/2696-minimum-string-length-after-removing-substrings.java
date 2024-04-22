class Solution {
    public int minLength(String s) {
        return reduceStringLength(s).length();
    }

    public String reduceStringLength(String s) {
        if (s.contains("AB") || s.contains("CD")) {
            int index = -1;
            if (s.contains("AB")) {
                index = s.indexOf("AB");
            } else {
                index = s.indexOf("CD");
            }
            s = s.substring(0, index) + s.substring(index+2, s.length());
            s = reduceStringLength(s);
        }
        return s;
    }
}
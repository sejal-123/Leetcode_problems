class Solution {
    public String makeGood(String s) {
        String s1 = "", s2 = "";
        s1 = s;
        while (true) {
            s1 = reduceString(s1);
            System.out.println(s1);
            s2 = reduceString(s1);
            System.out.println(s1 + " " + s2);
            if (s1.equals(s2)) {
                break;
            } else if (s2.equals("")) {
                break;
            }
        }
        return s2;     

    }

    public String reduceString(String s) {
        char ch[] = s.toCharArray();
        if (ch.length == 0 || ch.length == 1) {
            return s;
        }
        int i = ch.length - 2, j = ch.length - 1;
        while (i >= 0) {
            if ((Character.isUpperCase(ch[i]) && Character.isLowerCase(ch[j])) ||(Character.isUpperCase(ch[j]) && Character.isLowerCase(ch[i]))) {
                s = s.substring(0, i) + s.substring(j+1, s.length());
                System.out.println(s);
                return s;
            } else {
                i--;
                j--;
            }
        }
        return s;
    }
}
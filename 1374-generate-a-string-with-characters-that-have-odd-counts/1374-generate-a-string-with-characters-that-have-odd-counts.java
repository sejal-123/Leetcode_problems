class Solution {
    public String generateTheString(int n) {
        String ans = "";
        if (n%2 != 0) {
            int i = 0;
            while(i < n) {
                ans += "a";
                i++;
            }
            return ans;
        }
        else {
            int i = 0;
            while(i < n-1) {
                ans += "a";
                i++;
            }
            while(i < n) {
                ans += "b";
                i++;
            }
            return ans;
        }
    }
}
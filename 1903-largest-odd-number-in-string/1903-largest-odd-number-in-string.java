class Solution {
    public String largestOddNumber(String num) {
        if (Integer.parseInt(num.substring(num.length()-1, num.length())) % 2 == 1)
            return num;
        String max = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) % 2 == 1){
                max = num.substring(0, i+1);
            }
        }
        return max;
    }
}
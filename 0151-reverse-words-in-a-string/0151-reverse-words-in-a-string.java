class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int j = arr.length - 1;
        while (j >= 0) {
            if (!arr[j].equals("  ")) {
                sb.append(arr[j]);
                sb.append(" ");
            }
            j--;
        }
        return sb.toString().trim();
    }
}
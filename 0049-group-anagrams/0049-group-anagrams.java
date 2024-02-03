class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            temp.add(new String(ch));
        }
        int t[] = new int[strs.length];
        List<List<String>> ans =  new ArrayList<List<String>>();
        for (int i = 0; i < strs.length; i++) {
            ArrayList<String> temp1 = new ArrayList<>();
            if (t[i] == 0) {
                temp1.add(strs[i]);
                t[i] = 1;
            }
            for (int j = i+1; j < strs.length; j++) {
                if (temp.get(i).equals(temp.get(j)) && t[j] == 0) {
                    temp1.add(strs[j]);
                    t[j] = 1;
                }
            }
            if (temp1.size() > 0)
                ans.add(temp1);
        }
        return ans;
    }
}
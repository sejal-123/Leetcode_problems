class Solution {
    public String frequencySort(String s) {
        if (s.length() == 0) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        List<Character>[] arr = new List[s.length()+1];
        for (Character key: map.keySet()) {
            int val = map.get(key);
            if (arr[val] == null)
                arr[val] = new ArrayList<>();
            arr[val].add(key);
        }
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] != null) {
                for (char ch: arr[i]) {
                    ans.append(String.valueOf(ch).repeat(map.get(ch)));
                }
            }
        }  
        return ans.toString();
    }
}
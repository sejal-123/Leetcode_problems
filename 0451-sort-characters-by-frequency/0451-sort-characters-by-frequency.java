class Solution {
    public String frequencySort(String s) {
        if (s.length() == 0) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Character>> lst = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (!lst.containsKey(entry.getValue())) {
                lst.put(entry.getValue(), new ArrayList<>());
            }
            lst.get(entry.getValue()).add(entry.getKey());
        }
        for (Map.Entry<Integer, List<Character>> entry: lst.entrySet()) {
            for (char c: entry.getValue()) {
                ans.append(String.valueOf(c).repeat(entry.getKey()));
            }
        }
        
        return ans.toString();
    }
}
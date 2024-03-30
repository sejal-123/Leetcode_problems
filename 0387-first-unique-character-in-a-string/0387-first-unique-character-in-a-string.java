class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(char c: s.toCharArray()) {
            if (m.get(c) == null) 
                m.put(c, 1);
            else 
                m.put(c, m.get(c)+1);
        }
        int minIndex = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry: m.entrySet()) {
            if (entry.getValue() == 1)
                if (s.indexOf(entry.getKey()) < minIndex)
                    minIndex = s.indexOf(entry.getKey());
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
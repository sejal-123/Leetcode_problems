class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);    map.put('V', 5);
        map.put('X', 10);   map.put('L', 50);
        map.put('C', 100);  map.put('D', 500);
        map.put('M', 1000);
        int ans = 0, f = 0;
        int i = 0;
        while(i < s.length() - 1) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                ans += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                f = 1;
                i += 2;
            } else {
                ans += map.get(s.charAt(i));
                f = 0;
                i++;
            }
        }
        if (f == 0 || i == s.length() - 1) {
            ans += map.get(s.charAt(s.length() - 1));
        }
        return ans;
    }
}
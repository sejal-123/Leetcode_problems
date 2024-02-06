class Solution {
    public boolean isValid(String s) {
        char lastVisited = '1';
        ArrayList<Character> arr = new ArrayList<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        if (s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                arr.add(lastVisited);
                lastVisited = s.charAt(i);
            } else {
                if (lastVisited == '1' || s.charAt(i) != map.get(lastVisited))
                    return false;
                else {
                    lastVisited = arr.get(arr.size()-1);
                    arr.remove(arr.size()-1);
                }
            }
        }
        if (arr.size() > 1)
            return false;
        return true;
    }
}
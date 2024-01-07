class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       char arr[] = allowed.toCharArray();
       int c = 0;
       HashMap<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1);
       }
       for (int i = 0; i < words.length; i++) {
           arr = words[i].toCharArray();
        for (int j = 0; j < arr.length; j++) {
            if (map.get(arr[j]) == null)
                break;
            if (j == arr.length - 1)
                c++;    
        }
       }
       return c;
    }
}
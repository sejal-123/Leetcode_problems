class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int i = 0;
        ArrayList<Integer> a = new ArrayList<>();
        while(i < bank.length) {
            int one = 0;
            for (int k = 0; k < bank[i].length(); k++) {
                if (bank[i].charAt(k) == '1') {
                    one++;
                }            
            }
            i++;
            if (one > 0)
                a.add(one);
        }
        for (int j = 0; j < a.size()-1; j++) {
            count += a.get(j) * a.get(j+1);
        }
        System.out.println(a);
        return count;
    }
}
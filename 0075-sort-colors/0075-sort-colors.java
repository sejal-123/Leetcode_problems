class Solution {
    public void sortColors(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int j = 0; j < nums.length; j++) {
            if(map.get(nums[j]) == null) {
                map.put(nums[j], 1);
            } else {
                map.put(nums[j], map.get(nums[j])+1);
            }
        }
        int j = 0;
        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            int key = m.getKey();
            for (int k = 0; k < m.getValue(); k++) {
                nums[j] = m.getKey();
                j += 1;
            }
        }
        // int zeroes = 0, ones=0, twos=0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0)
        //         zeroes++;
        //     else if (nums[i] == 1)
        //         ones++;
        //     else
        //         twos++;
        // }
        // int p = 0, q = 0, r = 0, i = 0;
        // while (i < nums.length){
        //     while(p < zeroes) {
        //         nums[i] = 0;
        //         i++;
        //         p++;
        //     }
        //     while(q < ones) {
        //         nums[i] = 1;
        //         i++;
        //         q++;
        //     }
        //     while(r < twos) {
        //         nums[i] = 2;
        //         i++;
        //         r++;
        //     }
        // }
    }
}
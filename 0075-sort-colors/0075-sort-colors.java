class Solution {
    public void sortColors(int[] nums) {
        // int arr[] = new int[nums.length];
        // for (int j = 0; j < nums.length; j++) {
        //         arr[j] = nums[j];
        //     }
        // int k = 0;
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[j] == i) {
        //             nums[k] = i;
        //         }
        //     }
        // }
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
    }
}
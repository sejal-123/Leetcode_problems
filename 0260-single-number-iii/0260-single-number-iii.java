class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue() == 1) {
                arr[i] = entry.getKey();
                i++;
            }
        }
        return arr;
    }
}
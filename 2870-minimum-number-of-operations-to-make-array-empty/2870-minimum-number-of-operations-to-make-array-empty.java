class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        int c = 0;
        int size = nums.length;
            for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
                int value = mapElement.getValue();
                if (value == 1) {
                        return -1;
                } 
                while (value > 0 && value != 1) {
                    if (value % 3 == 0) {
                        c++;
                        value = value - 3;
                    } else if (value % 2 == 0) {
                        c++;
                        value = value - 2;
                    } else if (value % 2 != 0 || value % 3 != 0) {
                        if ((value - 4) % 3 == 0) {
                            c += (value - 4) / 3;
                            value = value - (value - 4);
                        } else if ((value - 2) % 3 == 0) {
                            c += (value - 2) / 3;
                            value = value - (value - 2);
                        }
                    }
                }
            }
        return c;
    }
}
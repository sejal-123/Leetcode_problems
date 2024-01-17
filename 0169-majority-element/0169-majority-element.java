class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int ele = nums[0], max = 0, count = 0;
        while(i < nums.length - 1) {
            if (nums[i] == nums[i+1]) {
                count += 1;
                System.out.println(count);
            } else {
                if (count > max) {
                    max = count;
                    count = 0;
                    ele = nums[i];
                    System.out.println(max + " " +  ele);
                }
            }
            i++;
        }
        if (i == nums.length-1) {
            if (count > max) {
                    max = count;
                    count = 0;
                    ele = nums[i];
                    System.out.println(max + " " +  ele);
            }
        }
        return ele;
    }
}
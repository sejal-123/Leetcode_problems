class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2= new ArrayList<>();
        for (int ele: nums) {
            if (ele >= 0)
                lst1.add(ele);
            else
                lst2.add(ele);
        }
        int i = 0, j = 0, k = 0;
        while (i < lst1.size() && j < lst2.size()) {
            nums[k] = lst1.get(i);
            k++;
            nums[k] = lst2.get(j);
            k++;
            i++;
            j++;
        }
        return nums;
    }
}
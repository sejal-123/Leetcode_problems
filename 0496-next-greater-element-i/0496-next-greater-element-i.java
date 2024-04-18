class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int n: nums2) {
            while (!st.isEmpty() && n > st.peek()) {
                map.put(st.pop(), n);
            }
            st.push(n);
        }
        int i = 0;
        for (int n: nums1) {
            ans[i++] = map.getOrDefault(n, -1);
        }
        return ans;
    }
}
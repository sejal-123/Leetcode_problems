class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int j = 0;
        for(int i: nums1) {
            int index = indexOf(i, nums2);
            index++;
            if (index < nums2.length) {
                while(index < nums2.length) {
                    if (nums2[index] > i) {
                        ans[j] = nums2[index];
                        break;
                    } else {
                        index++;
                        ans[j] = -1;
                    }
                }
            } else {
                ans[j] = -1;
            }
            j++;
        }
        return ans;
    }

    public int indexOf(int n, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
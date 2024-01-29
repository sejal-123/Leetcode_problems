class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mx = piles[0];
        for (int i: piles) {
            mx = i > mx ? i : mx;
        }
        return binarySearch(piles, mx, h);
    }

    public int  calculateTotalHours(int[] piles, double hr) {
        int sum = 0;
        for (double i: piles) {
            sum += Math.ceil(i/hr);
        }
        return sum;
    }

    public int binarySearch(int[] arr, int mx, int h) {
        int low = 1, high = mx;
        while(low <= high) {
            int mid = (low+high)/2;
            int hrs = calculateTotalHours(arr, mid);
            if (hrs <= h) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
}
class Solution {
    public int[] finalPrices(int[] prices) {
        if (prices.length == 0 || prices.length == 1)
            return prices;
        else {
            int temp[] = new int[prices.length];
            temp[prices.length-1] = prices[prices.length-1];
            int i = prices.length-2, j = 0;
            while (i >= 0) {
                j = i+1;
                if (prices[i] >= prices[j]) {
                    temp[i] = prices[i] - prices[j];
                    i--;
                } else {
                    while (j < prices.length) {
                        if (prices[i] >= prices[j]) {
                            temp[i] = prices[i] - prices[j];
                            i--;
                            break;
                        }
                        j++;
                    }
                    if (j == prices.length) {
                        temp[i] = prices[i];
                        i--;
                    }
                }
            }
            return temp;
        }
    }
}
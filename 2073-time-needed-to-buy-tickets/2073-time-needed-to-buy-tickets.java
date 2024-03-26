class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0, c = 0;
        while (tickets[k] > 0) {
            for (int j = 0; j < tickets.length; j++) {
                if (tickets[k] == 0) {
                    break;
                }
                else if (tickets[j] > 0) {
                    tickets[j]--;
                    c++;
                } 
            }
        }
        return c;
    }
}
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0, c = 0;
        int m = -1;
        for (Integer j: tickets) {
            if (j > m) {
                m = j;
            }
        }
        while (i < m) {
            for (int j = 0; j < tickets.length; j++) {
                System.out.println(tickets[j]);
                if (tickets[k] == 0 && j == k) {
                    i = m;
                    break;
                } else if (tickets[k] == 0) {
                    i = m;
                    break;
                }
                else if (tickets[j] > 0) {
                    tickets[j]--;
                    c++;
                } 
            }
            i++;
        }
        return c;
    }
}
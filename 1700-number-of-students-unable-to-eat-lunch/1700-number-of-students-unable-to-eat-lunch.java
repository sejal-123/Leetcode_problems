class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroes = 0, ones = 0;
        int i = 0; 
        while (i < students.length) {
            if (students[i] == 1)
                ones++;
            else
                zeroes++;
            i++;
        }
        for (int s: sandwiches) {
            if (s == 0) {
                if (zeroes == 0)
                    return ones;
                zeroes--;
            }
            else {
                if (ones == 0) {
                    return zeroes;
                }
                ones--;
            }
        }
        return 0;
    }
}
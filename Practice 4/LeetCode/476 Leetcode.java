class Solution {
    \\https://leetcode.com/problems/number-complement/submissions/2178621571/
    public int findComplement(int num) {
        long mask = 1;
        while (mask <= num) {
            mask <<= 1;
        }
        return (int) ((mask - 1) ^ num);
    }
}
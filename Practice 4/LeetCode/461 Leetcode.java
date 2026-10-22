class Solution {
    \\https://leetcode.com/problems/hamming-distance/submissions/2178620771/
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
class Solution {
    // Leetcode 1523: Count Odd Numbers in an Interval Range
    // https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/submissions/2177018702/
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
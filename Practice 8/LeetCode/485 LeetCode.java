class Solution {
    //https://leetcode.com/problems/max-consecutive-ones/submissions/2179200863/
    public int findMaxConsecutiveOnes(int[] nums) {
        int best = 0, cur = 0;
        for (int x : nums) {
            if (x == 1) {
                cur++;
                best = Math.max(best, cur);
            } else {
                cur = 0;
            }
        }
        return best;
    }
}
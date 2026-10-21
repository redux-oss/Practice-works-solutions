class Solution {
    //https://leetcode.com/problems/a-number-after-a-double-reversal/submissions/2178125429/
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0 ;
    }
}
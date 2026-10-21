class Solution {
    //https://leetcode.com/problems/add-digits/submissions/2178077550/
    public int addDigits(int num) {
     if (num == 0) return 0 ;
    return 1 + (num - 1) % 9 ;
    }
}
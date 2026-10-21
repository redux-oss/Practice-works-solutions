class Solution {
    https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/submissions/2178184936/
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n + 1) / 2;
        
        int k = n / m;
        
        int num2 = m * (k * (k + 1)) / 2;
        
        return totalSum - 2 * num2;
    }
}

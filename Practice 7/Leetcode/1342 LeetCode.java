class Solution {
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/2179197680/
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            steps++;
        }
        return steps;
    }
}
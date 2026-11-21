class Solution {
    \\https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/
  public char kthCharacter(int k) {
    StringBuilder word = new StringBuilder("a");
    while (word.length() < k) {
      int length = word.length();
      for (int i = 0; i < length; i++) {
        word.append((char) (word.charAt(i) + 1));
      }
    }
    return word.charAt(k - 1);
  }
}
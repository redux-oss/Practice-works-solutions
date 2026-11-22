class Solution {
    \\https://leetcode.com/problems/relative-sort-array/
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] counts = new int[1001];
    for (int n : arr1) {
      counts[n]++;
    }
    int[] result = new int[arr1.length];
    int index = 0;
    for (int n : arr2) {
      while (counts[n] > 0) {
        result[index++] = n;
        counts[n]--;
      }
    }
    for (int n = 0; n < counts.length; n++) {
      while (counts[n] > 0) {
        result[index++] = n;
        counts[n]--;
      }
    }
    return result;
  }
}
\\https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/
class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatest = 0;
    for (int candy : candies) {
      greatest = Math.max(greatest, candy);
    }
    List<Boolean> result = new ArrayList<>();
    for (int candy : candies) {
      result.add(candy + extraCandies >= greatest);
    }
    return result;
  }
}
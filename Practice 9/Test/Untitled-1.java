

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1ReturnsFour() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
  }

  @Test
  void example2ReturnsSix() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
  }

  @Test
  void example3ReturnsZero() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3})).isZero();
  }

  @Test
  void returnsZeroForSingleMinimumElement() {
    assertThat(solution.numIdenticalPairs(new int[] {1})).isZero();
  }

  @Test
  void handlesMaximumLengthAndValue() {
    int[] nums = new int[100];
    Arrays.fill(nums, 100);
    assertThat(solution.numIdenticalPairs(nums)).isEqualTo(4950);
  }
}
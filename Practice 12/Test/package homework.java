

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsThreeForExample1() {
    assertThat(solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3})).isEqualTo(3);
  }

  @Test
  void returnsFiveForExample2() {
    assertThat(solution.heightChecker(new int[] {5, 1, 2, 3, 4})).isEqualTo(5);
  }

  @Test
  void returnsZeroForExample3() {
    assertThat(solution.heightChecker(new int[] {1, 2, 3, 4, 5})).isEqualTo(0);
  }

  @Test
  void returnsZeroForSingleElement() {
    assertThat(solution.heightChecker(new int[] {1})).isEqualTo(0);
  }

  @Test
  void worksForMaximumSizeInReverseOrder() {
    int[] heights = IntStream.range(0, 100).map(i -> 100 - i).toArray();

    assertThat(solution.heightChecker(heights)).isEqualTo(100);
  }
}
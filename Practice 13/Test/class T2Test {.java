class T2Test {

  private final T2 solution = new T2();

  @Test
  void returnsThreeWhenCountsAreEqual() {
    assertThat(solution.maximumCount(new int[] {-2, -1, -1, 1, 2, 3})).isEqualTo(3);
  }

  @Test
  void ignoresZerosWhenNegativesDominate() {
    assertThat(solution.maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
  }

  @Test
  void returnsPositiveCountWhenNoNegatives() {
    assertThat(solution.maximumCount(new int[] {5, 20, 66, 1314})).isEqualTo(4);
  }

  @Test
  void returnsZeroForSingleZero() {
    assertThat(solution.maximumCount(new int[] {0})).isEqualTo(0);
  }

  @Test
  void returnsOneForSingleNegativeElement() {
    assertThat(solution.maximumCount(new int[] {-2000})).isEqualTo(1);
  }
}
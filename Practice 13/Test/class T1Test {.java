class T1Test {

  private final T1 solution = new T1();

  @Test
  void returnsFourForExample1() {
    assertThat(solution.firstBadVersion(5, v -> v >= 4)).isEqualTo(4);
  }

  @Test
  void returnsOneForSingleVersion() {
    assertThat(solution.firstBadVersion(1, v -> v >= 1)).isEqualTo(1);
  }

  @Test
  void returnsFirstVersionWhenAllVersionsAreBad() {
    assertThat(solution.firstBadVersion(100, v -> true)).isEqualTo(1);
  }

  @Test
  void returnsLastVersionWhenOnlyLastIsBad() {
    assertThat(solution.firstBadVersion(100, v -> v >= 100)).isEqualTo(100);
  }

  @Test
  void doesNotOverflowForMaximumN() {
    int max = Integer.MAX_VALUE;
    assertThat(solution.firstBadVersion(max, v -> v >= max)).isEqualTo(max);
  }
}
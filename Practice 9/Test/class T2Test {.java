class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1MarksAllButFourthKid() {
    assertThat(solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
        .containsExactly(true, true, true, false, true);
  }

  @Test
  void example2MarksOnlyFirstKid() {
    assertThat(solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
        .containsExactly(true, false, false, false, false);
  }

  @Test
  void example3MarksBothLeaders() {
    assertThat(solution.kidsWithCandies(new int[] {12, 1, 12}, 10))
        .containsExactly(true, false, true);
  }

  @Test
  void handlesMinimumTwoKids() {
    assertThat(solution.kidsWithCandies(new int[] {1, 100}, 1))
        .containsExactly(false, true);
  }

  @Test
  void handlesMaximumValues() {
    assertThat(solution.kidsWithCandies(new int[] {100, 100}, 50))
        .containsExactly(true, true);
  }
}
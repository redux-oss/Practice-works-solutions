class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1ReturnsB() {
    assertThat(solution.kthCharacter(5)).isEqualTo('b');
  }

  @Test
  void example2ReturnsC() {
    assertThat(solution.kthCharacter(10)).isEqualTo('c');
  }

  @Test
  void returnsAForMinimumK() {
    assertThat(solution.kthCharacter(1)).isEqualTo('a');
  }

  @Test
  void returnsHForMaximumK() {
    assertThat(solution.kthCharacter(500)).isEqualTo('h');
  }
}
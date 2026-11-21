class T2Test {
  private final T2 solution = new T2();

  private char[] reverse(char... s) {
    solution.reverseString(s);
    return s;
  }

  @Test
  void example1ReversesOddLength() {
    assertThat(reverse('h', 'e', 'l', 'l', 'o')).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void example2ReversesEvenLength() {
    assertThat(reverse('H', 'a', 'n', 'n', 'a', 'h')).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }

  @Test
  void keepsSingleElementUnchanged() {
    assertThat(reverse('x')).containsExactly('x');
  }
}
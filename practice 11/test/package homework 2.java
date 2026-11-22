package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsTwoForExample1() {
    assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void returnsTwoForExample2() {
    assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void returnsEightForExample3() {
    assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void returnsOneForSingleZero() {
    assertThat(solution.missingNumber(new int[] {0})).isEqualTo(1);
  }

  @Test
  void returnsZeroForSingleOne() {
    assertThat(solution.missingNumber(new int[] {1})).isEqualTo(0);
  }

  @Test
  void worksForMaximumSize() {
    int[] nums = IntStream.rangeClosed(0, 10_000).filter(i -> i != 7_777).toArray();

    assertThat(solution.missingNumber(nums)).isEqualTo(7_777);
  }
}
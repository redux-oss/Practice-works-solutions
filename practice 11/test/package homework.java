package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void returnsThreeForExample1() {
    assertThat(solution.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void returnsTwoForExample2() {
    assertThat(solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void returnsMinimumValueForSingleElement() {
    assertThat(solution.majorityElement(new int[] {-1_000_000_000})).isEqualTo(-1_000_000_000);
  }

  @Test
  void returnsMaximumValueWhenItIsMajority() {
    assertThat(solution.majorityElement(new int[] {1_000_000_000, 1, 1_000_000_000}))
        .isEqualTo(1_000_000_000);
  }

  @Test
  void worksForMaximumSizeWithFixedSeed() {
    List<Integer> list = new ArrayList<>(Collections.nCopies(25_001, 7));
    list.addAll(Collections.nCopies(24_999, -3));
    Collections.shuffle(list, new Random(42));
    int[] nums = list.stream().mapToInt(Integer::intValue).toArray();

    assertThat(solution.majorityElement(nums)).isEqualTo(7);
  }
}
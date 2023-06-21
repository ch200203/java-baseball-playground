package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {

    @Test
    @DisplayName("컴퓨터의 번호 생성")
    void createNumber() {
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> numbers = numberGenerator.createNumber();

        // 3개의 숫자가 담길때 까지.
        assertThat(numbers.size()).isEqualTo(3);

        // 3개의 난수가 서로 달라야함.
        assertThat(numbers.get(0) != numbers.get(1)).isTrue();
        assertThat(numbers.get(0) != numbers.get(2)).isTrue();
        assertThat(numbers.get(1) != numbers.get(2)).isTrue();

        // 숫자는 1에서 9 사이
        assertThat(1 <= numbers.get(0) && numbers.get(0) <= 9).isTrue();
        assertThat(1 <= numbers.get(1) && numbers.get(1) <= 9).isTrue();
        assertThat(1 <= numbers.get(2) && numbers.get(2) <= 9).isTrue();
    }
}
package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RefereeTest {

    private Referee referee;
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,0볼 3스트라이크", "7,8,9,낫싱", "3,1,6,2볼 0스트라이크", "3,2,1,3볼 0스트라이크"})
    public void compare(int number1, int number2, int number3, String expected) {
        String actual = referee.compare(ANSWER, Arrays.asList(number1, number2, number3));
        assertThat(actual).isEqualTo("expected");
    }

    @Test
    void 스트라이크3() {
        String result = referee.compare(ANSWER, Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0볼 3스트라이크");
    }

    @Test
    void 낫싱() {
        String result = referee.compare(ANSWER, Arrays.asList(4, 5, 6));
        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    void 볼3() {
        String result = referee.compare(ANSWER, Arrays.asList(3, 1, 6));
        assertThat(result).isEqualTo("2볼 0스트라이크");
    }
}
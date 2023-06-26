package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class RefereeTest {

    @Test
    void compare() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
        assertThat(result).isEqualTo("0볼 3스트라이크");

        String result2 = referee.compare(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
        assertThat(result2).isEqualTo("낫싱");
    }
}
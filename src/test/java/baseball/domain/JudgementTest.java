package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class JudgementTest {

    @Test
    void correctCount() {
        List<Integer> computerNumbers = Arrays.asList(1, 2, 3);
        List<Integer> userNumbers = Arrays.asList(1, 2, 3);

        Judgement judgement = new Judgement();
        int result = judgement.correctCount(computerNumbers, userNumbers);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void hasPosition() {
    }
}
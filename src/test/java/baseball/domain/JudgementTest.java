package baseball.domain;

import static org.assertj.core.api.Assertions.*;
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

        assertThat(result).isEqualTo(3);
    }

    @Test
    void hasPosition() {
        Judgement judgement = new Judgement();
        boolean result = judgement.hasPosition(Arrays.asList(7,8,9), 0, 7);
        boolean result2 = judgement.hasPosition(Arrays.asList(7,8,9), 0, 8);
        assertThat(result).isTrue();
        assertThat(result2).isFalse();
    }
}
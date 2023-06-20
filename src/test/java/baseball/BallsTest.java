package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import com.baseball.Ball;
import com.baseball.Balls;
import com.baseball.PlayResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BallsTest {

    @Test
    void play_nothing() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = answer.play(Arrays.asList(6, 5, 4));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void play_1strike_1ball() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = answer.play(Arrays.asList(1, 4, 2));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void play_3strike() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = answer.play(Arrays.asList(1, 2, 3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.isGameEnd()).isTrue();
    }

    @Test
    void play() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = answer.play(Arrays.asList(4, 5, 6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void strike() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = answer.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = answer.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = answer.play(new Ball(1, 4));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

}

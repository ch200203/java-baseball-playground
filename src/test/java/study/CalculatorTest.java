package study;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CalculatorTest {

    @Test
    void calculatorTest() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate("2 + 3 * 4 / 2")).isEqualTo(10);
    }
}

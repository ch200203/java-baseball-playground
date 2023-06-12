package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("1,2 String Split Test")
    void splitTest() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");

        actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    @DisplayName("(1,2) String SubString Test")
    void subStringTest() {
        String inputString = "(1,2)";
        String result = inputString.substring(1, inputString.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String CharAt Test Operation and Exception")
    void charAtTest() {
        String input = "abc";
        assertThat(input.charAt(0)).isEqualTo('a');

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char ch = input.charAt(input.length() + 1);
                });
    }
}

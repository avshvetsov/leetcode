package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class _564Test {

    private static _564 task;

    @BeforeEach
    public void setup() {
        task = new _564();
    }

    @Test
    void nearestPalindromicExample1() {
        assertThat(task.nearestPalindromic("123")).isEqualTo("121");
    }

    @Test
    void nearestPalindromicExample2() {
        assertThat(task.nearestPalindromic("1")).isEqualTo("0");
    }

    @Test
    void nearestPalindromicTC202() {
        assertThat(task.nearestPalindromic("1095500901")).isEqualTo("1095445901");
    }

    @ParameterizedTest
    @CsvSource({
            "1234, 1221",
            "12345, 12321",
            "9999, 10001",
            "99999, 100001",
            "10000, 9999",
            "1001, 999",
            "4554, 4444",
            "6556, 6446",
            "68786, 68686",
            "99800, 99799",
            "12120, 12121",
            "12932, 12921"
    })
    void nearestPalindromicMyTC(String input, String expected) {
        assertThat(task.nearestPalindromic(input)).isEqualTo(expected);
    }


}
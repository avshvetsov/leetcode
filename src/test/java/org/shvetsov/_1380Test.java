package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _1380Test {

    private static _1380 task;

    @BeforeEach
    public void setup() {
        task = new _1380();
    }

    @Test
    void luckyNumbersExample1() {
        assertThat(task.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}})).hasSameElementsAs(List.of(15));
    }

    @Test
    void luckyNumbersExample2() {
        assertThat(task.luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}})).hasSameElementsAs(List.of(12));
    }

    @Test
    void luckyNumbersExample3() {
        assertThat(task.luckyNumbers(new int[][]{{7, 8}, {1, 2}})).hasSameElementsAs(List.of(7));
    }
}
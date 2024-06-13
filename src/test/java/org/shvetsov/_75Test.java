package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _75Test {

    private static _75 task;
    private static _75.CountingSort taskCountingSort;

    @BeforeEach
    public void setup() {
        task = new _75();
        taskCountingSort = new _75.CountingSort();
    }

    @Test
    void sortColorsExample1() {
        int[] input = {2, 0, 2, 1, 1, 0};
        task.sortColors(input);
        assertThat(input).isEqualTo(new int[]{0, 0, 1, 1, 2, 2});
    }

    @Test
    void sortColorsExample2() {
        int[] input = {2, 0, 1};
        task.sortColors(input);
        assertThat(input).isEqualTo(new int[]{0, 1, 2});
    }

    @Test
    void sortColorsCountingSortExample1() {
        int[] input = {2, 0, 2, 1, 1, 0};
        taskCountingSort.sortColors(input);
        assertThat(input).isEqualTo(new int[]{0, 0, 1, 1, 2, 2});
    }

    @Test
    void sortColorsCountingSortExample2() {
        int[] input = {2, 0, 1};
        taskCountingSort.sortColors(input);
        assertThat(input).isEqualTo(new int[]{0, 1, 2});
    }
}
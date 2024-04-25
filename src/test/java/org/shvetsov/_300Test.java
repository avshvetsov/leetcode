package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class _300Test {

    private static _300 task;

    @BeforeEach
    public void setup() {
        task = new _300();
    }

    @Test
    void lengthOfLIS() {
        assertThat(task.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})).isEqualTo(4);
        assertThat(task.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3})).isEqualTo(4);
        assertThat(task.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7})).isEqualTo(1);
    }

    @Test
    void lengthOfLIS1() {
        assertThat(task.lengthOfLIS(new int[]{4, 10, 4, 3, 8, 9})).isEqualTo(3);
        assertThat(task.lengthOfLIS(new int[]{3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12})).isEqualTo(6);
    }

    @Test
    void name() {
        int[] ints = {1, 2, 5, 7};
        int i = 0;

        int j = ints.length - 1;
        while (j >= 0 && i < ints[j]) {
            j--;
        }
        if (j < 0 || i > ints[j]) {
            ints[j + 1] = i;
        }
        System.out.println(Arrays.toString(ints));
    }
}
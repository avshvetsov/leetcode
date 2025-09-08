package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class _1304Test {

    private _1304 task;

    @BeforeEach
    public void setup() {
        this.task = new _1304();
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 3, 1})
    void sumZero(final int n) {
        assertThat(this.task.sumZero(n)).satisfies(
                res -> assertThat(res.length).isEqualTo(n),
                res -> assertThat(Arrays.stream(res).sum()).isEqualTo(0));
    }
}
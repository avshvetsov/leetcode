package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class _1317Test {

    private _1317 task;

    @BeforeEach
    public void setup() {
        this.task = new _1317();
    }

    @Test
    void getNoZeroIntegersExample1() {
        assertThat(task.getNoZeroIntegers(2)).satisfies(
                res -> assertThat(res.length).isEqualTo(2),
                res -> assertThat(res[0] + res[1]).isEqualTo(2),
                res -> assertThat(res).asString().doesNotContain("0"));
    }

    @Test
    void getNoZeroIntegersExample2() {
        assertThat(task.getNoZeroIntegers(11)).satisfies(
                res -> assertThat(res.length).isEqualTo(2),
                res -> assertThat(res[0] + res[1]).isEqualTo(11),
                res -> assertThat(Arrays.toString(res)).doesNotContain("0"));
    }
}
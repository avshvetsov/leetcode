package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1079Test {

    private static _1079 task;

    @BeforeEach
    public void setup() {
        task = new _1079();
    }

    @Test
    void numTilePossibilitiesExample1() {
        assertThat(task.numTilePossibilities("AAB")).isEqualTo(8);
    }

    @Test
    void numTilePossibilitiesExample2() {
        assertThat(task.numTilePossibilities("AAABBC")).isEqualTo(188);
    }

    @Test
    void numTilePossibilitiesExample3() {
        assertThat(task.numTilePossibilities("V")).isEqualTo(1);
    }

}
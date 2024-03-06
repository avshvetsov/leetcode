package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _6Test {

    private static _6 task;

    @BeforeEach
    public void setup() {
        task = new _6();
    }

    @Test
    void convert() {
        assertThat(task.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
        assertThat(task.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
        assertThat(task.convert("A", 1)).isEqualTo("A");
    }
}
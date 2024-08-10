package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _959Test {

    private static _959 task;

    @BeforeEach
    public void setup() {
        task = new _959();
    }

    @Test
    void regionsBySlashesExample1() {
        assertThat(task.regionsBySlashes(new String[]{" /", "/ "})).isEqualTo(2);
    }
    @Test
    void regionsBySlashesExample2() {
        assertThat(task.regionsBySlashes(new String[]{" /","  "})).isEqualTo(1);
    }
    @Test
    void regionsBySlashesExample3() {
        assertThat(task.regionsBySlashes(new String[]{"/\\","\\/"})).isEqualTo(5);
    }
    @Test
    void regionsBySlashesTC5() {
        assertThat(task.regionsBySlashes(new String[]{"//","/ "})).isEqualTo(3);
    }
}
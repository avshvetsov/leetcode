package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _726Test {

    private static _726 task;

    @BeforeEach
    public void setup() {
        task = new _726();
    }

    @Test
    void countOfAtomsExample1() {
        assertThat(task.countOfAtoms("H2O")).isEqualTo("H2O");
    }

    @Test
    void countOfAtomsExample2() {
        assertThat(task.countOfAtoms("Mg(OH)2")).isEqualTo("H2MgO2");
    }

    @Test
    void countOfAtomsExample3() {
        assertThat(task.countOfAtoms("K4(ON(SO3)2)2")).isEqualTo("K4N2O14S4");
    }
}
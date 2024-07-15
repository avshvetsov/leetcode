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

    @Test
    void countOfAtomsTC14() {
        assertThat(task.countOfAtoms("((N42)24(OB40Li30CHe3O48LiNN26)33(C12Li48N30H13HBe31)21(BHN30Li26BCBe47N40)15(H5)16)14"))
                .isEqualTo("B18900Be18984C4200H5446He1386Li33894N50106O22638");
    }
}
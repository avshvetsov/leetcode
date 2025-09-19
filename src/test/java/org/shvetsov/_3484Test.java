package org.shvetsov;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3484Test {

    @Test
    void TaskManagerExample1() {
        _3484.Spreadsheet spreadsheet = new _3484.Spreadsheet(3);
        assertThat(spreadsheet.getValue("=5+7")).isEqualTo(12);
        spreadsheet.setCell("A1", 10);
        assertThat(spreadsheet.getValue("=A1+6")).isEqualTo(16);
        spreadsheet.setCell("B2", 15);
        assertThat(spreadsheet.getValue("=A1+B2")).isEqualTo(25);
        spreadsheet.resetCell("A1");
        assertThat(spreadsheet.getValue("=A1+B2")).isEqualTo(15);
    }

}
package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2349Test {

    private static _2349 task;

    @BeforeEach
    public void setup() {
        task = new _2349();
    }

    @Test
    void NumberContainersExample1() {
         _2349.NumberContainers nc = new _2349.NumberContainers();
        assertThat(nc.find(10)).isEqualTo(-1);
        nc.change(2, 10);
        nc.change(1, 10);
        nc.change(3, 10);
        nc.change(5, 10);
        assertThat(nc.find(10)).isEqualTo(-1);
        nc.change(1, 20);
        assertThat(nc.find(10)).isEqualTo(-1);
    }

}
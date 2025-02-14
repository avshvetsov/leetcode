package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1352Test {

    private static _1352.ProductOfNumbers task;

    @BeforeEach
    public void setup() {
        task = new _1352.ProductOfNumbers();
    }

    @Test
    void productOfNumbersExample1() {
        task.add(3);
        task.add(0);
        task.add(2);
        task.add(5);
        task.add(4);
        assertThat(task.getProduct(2)).isEqualTo(20);
        assertThat(task.getProduct(3)).isEqualTo(40);
        assertThat(task.getProduct(4)).isEqualTo(0);
        task.add(8);
        assertThat(task.getProduct(2)).isEqualTo(32);
    }

}
package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1352Test {

    private static _1352.ProductOfNumbers task;
    private static _1352.ProductOfNumbersArray taskArray;

    @BeforeEach
    public void setup() {
        task = new _1352.ProductOfNumbers();
        taskArray = new _1352.ProductOfNumbersArray();
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

    @Test
    void productOfNumbersArrayExample1() {
        taskArray.add(3);
        taskArray.add(0);
        taskArray.add(2);
        taskArray.add(5);
        taskArray.add(4);
        assertThat(taskArray.getProduct(2)).isEqualTo(20);
        assertThat(taskArray.getProduct(3)).isEqualTo(40);
        assertThat(taskArray.getProduct(4)).isEqualTo(0);
        taskArray.add(8);
        assertThat(taskArray.getProduct(2)).isEqualTo(32);
    }

}
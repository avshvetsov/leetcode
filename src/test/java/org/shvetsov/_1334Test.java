package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1334Test {

    private static _1334 task;

    @BeforeEach
    public void setup() {
        task = new _1334();
    }

    @Test
    void findTheCityExample1() {
        assertThat(task.findTheCity(4, new int[][]{{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}}, 4)).isEqualTo(3);
    }

    @Test
    void findTheCityExample2() {
        assertThat(task.findTheCity(5, new int[][]{{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}}, 2)).isEqualTo(0);
    }

    @Test
    void findTheCityTC2() {
        assertThat(task.findTheCity(6, new int[][]{{0,3,7},{2,4,1},{0,1,5},{2,3,10},{1,3,6},{1,2,1}}, 417)).isEqualTo(5);
    }
    
    @Test
    void findTheCityTC38() {
        assertThat(task.findTheCity(6, new int[][]{{3,5,2},{0,5,5},{4,5,7},{0,2,5},{0,3,1},{3,4,1},{2,5,4},{2,3,8},{1,2,10},{1,3,1}}, 6193)).isEqualTo(5);
    }
    
    @Test
    void findTheCityTC50() {
        assertThat(task.findTheCity(6, new int[][]{{0,1,10},{0,2,1},{2,3,1},{1,3,1},{1,4,1},{4,5,10}}, 20)).isEqualTo(5);
    }
}
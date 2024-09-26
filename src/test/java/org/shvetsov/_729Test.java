package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _729Test {

    private _729.MyCalendar calendar;

    @BeforeEach
    public void setup() {
        this.calendar = new _729.MyCalendar();
    }

    @Test
    void bookMyCalendarExample1() {
        assertThat(calendar.book(10, 20)).isTrue();
        assertThat(calendar.book(15, 25)).isFalse();
        assertThat(calendar.book(20, 30)).isTrue();
    }

    @Test
    void bookMyCalendarTC94() {
        int[][] input = new int[][]{{20,29},{13,22},{44,50},{1,7},{2,10},{14,20},{19,25},{36,42},{45,50},{47,50},{39,45},{44,50},{16,25},{45,50},{45,50},{12,20},{21,29},{11,20},{12,17},{34,40},{10,18},{38,44},{23,32},{38,44},{15,20},{27,33},{34,42},{44,50},{35,40},{24,31}};
        boolean[] expected = new boolean[]{true,false,true,true,false,true,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        for (int i = 0; i < input.length; i++) {
            assertThat(calendar.book(input[i][0], input[i][1])).as("Start <%s>, end <%s>, expected <%s>", input[i][0], input[i][1], expected[i])
                    .isEqualTo(expected[i]);
        }
    }
}
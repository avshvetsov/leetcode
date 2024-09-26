package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@LeetCode(
        number = 729,
        name = "My Calendar I",
        level = Level.MEDIUM,
        tags = {"Array", "Binary Search", "Design", "Segment Tree", "Ordered Set"}
)
public class _729 {

    static class MyCalendar {

        private final NavigableMap<Integer, Boolean> isFreeMap = new TreeMap<>();

        public MyCalendar() {
            isFreeMap.put(0, true);
        }

        public boolean book(int start, int end) {
            Map.Entry<Integer, Boolean> isStartFree = isFreeMap.floorEntry(start);
            Map.Entry<Integer, Boolean> isEndFree = isFreeMap.lowerEntry(end);
            if (isEndFree.getValue() && isStartFree.getValue() && isEndFree.getKey() <= start) {
                if (!isFreeMap.containsKey(end)) {
                    isFreeMap.put(end, true);
                }
                isFreeMap.put(start, false);
                return true;
            }
            return false;
        }
    }
}
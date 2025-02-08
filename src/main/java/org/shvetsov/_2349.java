package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2349,
        name = "Design a Number Container System",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Design", "Heap (Priority Queue)", "Ordered Set"}
)
public class _2349 {

    static class NumberContainers {

        Map<Integer, Integer> indexNumber;
        Map<Integer, SortedSet<Integer>> numberIndexes;

        public NumberContainers() {
            this.indexNumber = new HashMap<>();
            this.numberIndexes = new HashMap<>();
        }

        public void change(int index, int number) {
            if (indexNumber.containsKey(index)) {
                Integer prevNum = indexNumber.get(index);
                numberIndexes.get(prevNum).remove(index);
            }
            indexNumber.put(index, number);
            numberIndexes.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
        }

        public int find(int number) {
            SortedSet<Integer> indexes = numberIndexes.getOrDefault(number, new TreeSet<>());
            return indexes.isEmpty() ? -1 : indexes.getFirst();
        }
    }
}
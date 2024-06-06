package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@LeetCode(
        number = 846,
        name = "Hand of Straights",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Greedy", "Sorting"}
)
public class _846 {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        if (groupSize == 1) return true;
        Arrays.sort(hand);
        int minCardIndex = 0;
        for (int i = 0; i < hand.length / groupSize; i++) {
            minCardIndex = findMinCardIndex(hand, minCardIndex);
            int card = hand[minCardIndex];
            int size = 0;
            int j = minCardIndex;
            while (j < hand.length && hand[j] <= card && size < groupSize) {
                if (hand[j] == card) {
                    hand[j] = -1;
                    size++;
                    card++;
                }
                j++;
            }
            if (size < groupSize) return false;
        }
        return true;
    }

    private int findMinCardIndex(int[] hand, int startIndex) {
        for (int i = startIndex; i < hand.length; i++) {
            if (hand[i] != -1) return i;
        }
        return -1;
    }


    public static class NotEfficient {
        public boolean isNStraightHand(int[] hand, int groupSize) {
            if (hand.length % groupSize != 0) return false;
            if (groupSize == 1) return true;
            Map<Integer, Long> map = Arrays.stream(hand)
                    .boxed()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            for (int i = 0; i < hand.length / groupSize; i++) {
                int card = defineMinCard(map);
                int currGroupSize = 0;
                while (currGroupSize < groupSize) {
                    if (!map.containsKey(card)) return false;
                    map.compute(card, (k, v) -> v - 1);
                    if (map.get(card) < 0) {
                        return false;
                    } else {
                        card++;
                    }
                    currGroupSize++;
                }
            }
            return true;
        }

        private int defineMinCard(Map<Integer, Long> map) {
            return map.entrySet().stream()
                    .filter(e -> e.getValue() > 0)
                    .map(Map.Entry::getKey)
                    .min(Integer::compareTo)
                    .orElse(-10);
        }
    }
}
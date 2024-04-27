package org.shvetsov;

import org.apache.commons.math3.util.Pair;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 514,
        name = "Freedom Trail",
        level = Level.HARD,
        tags = {"String", "Dynamic Programming", "Depth-First Search", "Breadth-First Search"}
)
public class _514 {
    public int findRotateSteps(String ring, String key) {
        int[][] distances = new int[ring.length()][ring.length()];
        int n = ring.length();
        for (int i = 0; i < distances.length; i++) {
            int ii = 1;
            while (ii <= n - ii) {
                distances[i][(i + ii) % n] = ii;
                distances[i][(n + i - ii) % n] = ii;
                ii++;
            }
        }

        List<Pair<Integer, Integer>> states = new ArrayList<>();
        states.add(new Pair<>(0, 0));
        for (char c : key.toCharArray()) {
            List<Pair<Integer, Integer>> prevStates = new ArrayList<>(states);
            states = new ArrayList<>();

            int index = ring.indexOf(c);
            while (index >= 0) {
                int min = Integer.MAX_VALUE;
                for (Pair<Integer, Integer> prevState : prevStates) {
                    min = Math.min(min, prevState.getValue() + distances[prevState.getKey()][index]);
                }
                states.add(new Pair<>(index, min));
                index = ring.indexOf(c, index + 1);
            }
        }

        int res = states.stream()
                .mapToInt(Pair::getValue)
                .min()
                .orElseThrow();
        return res + key.length();
    }



    public static class Improvements {
        public int findRotateSteps(String ring, String key) {
            char[] r = ring.toCharArray();
            List<Integer>[] positions = new List[26];
            for (int i = 0; i < r.length; i++) {
                int c = r[i] - 'a';
                if (positions[c] == null) positions[c] = new ArrayList<>();
                positions[c].add(i);
            }

            List<int[]> states = new ArrayList<>();
            states.add(new int[]{0, 0});
            for (char c : key.toCharArray()) {
                List<int[]> prevStates = new ArrayList<>(states);
                states = new ArrayList<>();

                for (Integer index : positions[c - 'a']) {
                    int min = Integer.MAX_VALUE;
                    for (int[] prevState : prevStates) {
                        min = Math.min(min, prevState[1] + Math.min(Math.abs(index - prevState[0]), ring.length() - Math.abs(index - prevState[0])));
                    }
                    states.add(new int[]{index, min});
                }
            }

            int res = Integer.MAX_VALUE;
            for (int[] state : states) {
                res = Math.min(res, state[1]);
            }
            return res + key.length();
        }
    }

}
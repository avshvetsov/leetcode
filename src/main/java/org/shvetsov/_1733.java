package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1733,
        name = "Minimum Number of People to Teach",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Greedy", "Biweekly Contest 44"}
)
public class _1733 {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Map<Integer, Set<Integer>> langs = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            langs.put(i + 1, new HashSet<>(Arrays.stream(languages[i]).boxed().toList()));
        }
        Set<Integer> shouldBeTeach = new HashSet<>();
        for (int[] friends : friendships) {
            Set<Integer> p1 = langs.get(friends[0]);
            Set<Integer> p2 = langs.get(friends[1]);
            if (Collections.disjoint(p1, p2)) {
                shouldBeTeach.add(friends[0]);
                shouldBeTeach.add(friends[1]);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int needTeach = 0;
            for (Integer user : shouldBeTeach) {
                if (!langs.get(user).contains(i)) {
                    needTeach++;
                }
            }
            res = Math.min(res, needTeach);
        }
        return res;
    }


    public int minimumTeachingsBF(int n, int[][] languages, int[][] friendships) {
        int res = Integer.MAX_VALUE;
        Map<Integer, Set<Integer>> langs = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            langs.put(i + 1, new HashSet<>(Arrays.stream(languages[i]).boxed().toList()));
        }
        for (int i = 1; i <= n; i++) {
            Set<Integer> persons = new HashSet<>();
            for (int[] friends : friendships) {
                Set<Integer> p1 = langs.get(friends[0]);
                Set<Integer> p2 = langs.get(friends[1]);
                if (Collections.disjoint(p1, p2)) {
                    if (!p1.contains(i)) {
                        persons.add(friends[0]);
                    }
                    if (!p2.contains(i)) {
                        persons.add(friends[1]);
                    }
                }
            }
            res = Math.min(res, persons.size());
        }
        return res;
    }
}
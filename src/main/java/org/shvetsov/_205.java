package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 205,
        name = "Isomorphic Strings",
        level = Level.EASY,
        tags = {"Hash Table", "String"}
)
public class _205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sarr = new int[200];
        int[] tarr = new int[200];

        for (int i = 0; i < s.length(); i++) {
            if (sarr[s.charAt(i)] != tarr[t.charAt(i)]) {
                return false;
            }
            sarr[s.charAt(i)] = i + 1;
            tarr[t.charAt(i)] = i + 1;
        }
        return true;
    }



    public boolean isIsomorphic2(String s, String t) {
        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> tm = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char sc = s.charAt(i);
                char tc = t.charAt(i);
                int si = 0, ti = 0;
                if (sm.containsKey(sc)) {
                    si = sm.get(sc);
                } else {
                    sm.put(sc, i);
                    si = i;
                }
                if (tm.containsKey(tc)) {
                    ti = tm.get(tc);
                } else {
                    tm.put(tc, i);
                    ti = i;
                }
                if (si != ti) {
                    return false;
                }
            }
        }
        return true;
    }
}
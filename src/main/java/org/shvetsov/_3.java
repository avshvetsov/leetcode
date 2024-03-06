package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 3,
        name = "Longest Substring Without Repeating Characters",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Sliding Window"}
)
public class _3 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int res = 0;
        for (int r = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }
            res = Math.max(res, r - l + 1);
            map.put(s.charAt(r), r);
        }
        return res;
    }


}

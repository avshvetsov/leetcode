package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 2491,
        name = "Divide Players Into Teams of Equal Skill",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Two Pointers", "Sorting"}
)
public class _2491 {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long result = 0;
        int l = 0;
        int r = skill.length - 1;
        int sum = skill[l] + skill[r];
        while (r > l) {
            if (sum != skill[l] + skill[r]) return -1;
            result += (long) skill[l] * skill[r];
            l++;
            r--;
        }
        return result;
    }
}
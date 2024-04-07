package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.List;
import java.util.stream.Collectors;

@LeetCode(
        number = 1544,
        name = "Make The String Great",
        level = Level.EASY,
        tags = {"String", "Stack"}
)
public class _1544 {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        int r = 1;
        int l = 0;
        while (r < chars.length) {
            if (Math.abs(chars[l] - chars[r]) == 32) {
                //symbol ' ' is required (https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html)
                chars[l] = ' ';
                chars[r] = ' ';
                r++;
                do {
                    l--;
                } while (l > 0 && chars[l] == ' ');
                if (l < 0) {
                    l = 0;
                }
            } else {
                l = r;
                r++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] != ' ') {
                sb.append(chars[j]);
            }
        }
        return sb.toString();
    }


    public String makeGoodBadSolution(String s) {
        List<Character> characters = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int i = 0;
        while (i < characters.size() - 1) {
            if (Character.toLowerCase(characters.get(i)) == Character.toLowerCase(characters.get(i + 1)) && characters.get(i) != characters.get(i + 1)) {
                characters.remove(i);
                characters.remove(i);
                i -= 2;
            }
            i++;
            if (i < 0) {
                i = 0;
            }
        }
        return characters.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
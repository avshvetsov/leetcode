package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1813,
        name = "Sentence Similarity III",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "String"}
)
public class _1813 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        return s1.length < s2.length ? checkSimilarity(s1, s2) : checkSimilarity(s2, s1);
    }

    private boolean checkSimilarity(String[] small, String[] large) {
        int ls = 0, ll = 0;
        int rs = small.length - 1, rl = large.length - 1;

        while (ls <= rs) {
            if (small[ls].equals(large[ll])) {
                ls++;
                ll++;
            } else if (small[rs].equals(large[rl])) {
                rs--;
                rl--;
            } else return false;
        }
        return true;
    }
}
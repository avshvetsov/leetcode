package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;

@LeetCode(
        number = 165,
        name = "Compare Version Numbers",
        level = Level.MEDIUM,
        tags = {"Two Pointers", "String"}
)
public class _165 {

    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        for (int i = 0; i < Math.max(split1.length, split2.length); i++) {
            int v1 = i < split1.length ? Integer.parseInt(split1[i]) : 0;
            int v2 = i < split2.length ? Integer.parseInt(split2[i]) : 0;
            if (v1 < v2) return -1;
            if (v1 > v2) return 1;
        }
        return 0;
    }

    public static class TwoPointers {
        public int compareVersion(String version1, String version2) {
            int i = 0, j = 0;

            while (i < version1.length() || j < version2.length()) {
                int v1 = 0, v2 = 0;

                while (i < version1.length() && version1.charAt(i) != '.') {
                    v1 = v1 * 10 + (version1.charAt(i) - '0');
                    i++;
                }
                while (j < version2.length() && version2.charAt(j) != '.') {
                    v2 = v2 * 10 + (version2.charAt(j) - '0');
                    j++;
                }

                if (v1 > v2) return 1;
                else if (v1 < v2) return -1;

                i++; j++;
            }

            return 0;
        }
    }

    public static class WithWhile {
        public int compareVersion(String version1, String version2) {
            String[] split1 = version1.split("\\.");
            String[] split2 = version2.split("\\.");
            int i = 0;
            while (i < split1.length && i < split2.length) {
                int compared = Comparator.comparing((String value) -> Integer.parseInt(value)).compare(split1[i], split2[i]);
                if (compared < 0) {
                    return -1;
                } else if (compared > 0) {
                    return 1;
                }
                i++;
            }
            while (i < split1.length) {
                if (Integer.parseInt(split1[i]) > 0) {
                    return 1;
                }
                i++;
            }
            while (i < split2.length) {
                if (Integer.parseInt(split2[i]) > 0) {
                    return -1;
                }
                i++;
            }
            return 0;
        }
    }
}
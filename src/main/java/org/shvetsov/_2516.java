package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 2516,
        name = "Take K of Each Character From Left and Right",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Sliding Window"}
)
public class _2516 {
    public int takeCharacters(String s, int k) {
        if (k == 0) return 0;
        int n = s.length();
        char[] chars = s.toCharArray();
        int[] leftCount = new int[3];
        int[] rightCount = new int[3];
        int i = n - 1;
        while (rightCount[0] < k || rightCount[1] < k || rightCount[2] < k) {
            if (i < 0) return -1;
            rightCount[chars[i] - 'a']++;
            i--;
        }
        int left = 0;
        int right = n - i - 1;
        int result = Integer.MAX_VALUE;
        while (left < n && right > 0) {
            while (right > 0 && rightCount[chars[n - right] - 'a'] + leftCount[chars[n - right] - 'a'] > k) {
                rightCount[chars[n - right] - 'a']--;
                right--;
            }
            result = Math.min(result, left + right);
            leftCount[chars[left] - 'a']++;
            left++;
        }
        return result;
    }

    public static class WithsingleWindow {
        public int takeCharacters(String s, int k) {
            if (k == 0) return 0;
            int n = s.length();
            char[] chars = s.toCharArray();
            int[] window = new int[3];
            int left = 0;
            int right = n;
            while (window[0] < k || window[1] < k || window[2] < k) {
                right--;
                if (right < 0) return -1;
                window[chars[right] - 'a']++;
            }
            int result = Integer.MAX_VALUE;
            while (left < n && right < n) {
                while (right < n && window[chars[right] - 'a'] > k) {
                    window[chars[right] - 'a']--;
                    right++;
                }
                result = Math.min(result, left + (n - right));
                window[chars[left] - 'a']++;
                left++;
            }
            return result;
        }
    }

    public static class NotEfficient {
        public int takeCharacters(String s, int k) {
            if (k == 0) return 0;
            int n = s.length();
            int[][] leftCount = new int[s.length() + 1][3];
            int[][] rightCount = new int[s.length() + 1][3];
            int[] leftCurrent = new int[]{0, 0, 0};
            int[] rightCurrent = new int[]{0, 0, 0};
            char[] chars = s.toCharArray();
            for (int i = 0; i < n + 1; i++) {
                leftCount[i] = Arrays.copyOf(leftCurrent, leftCurrent.length);
                rightCount[i] = Arrays.copyOf(rightCurrent, leftCurrent.length);
                if (i == n) break;
                leftCurrent[chars[i] - 'a']++;
                rightCurrent[chars[n - 1 - i] - 'a']++;
            }

            if (Arrays.stream(leftCount[n]).anyMatch(count -> count < k)) {
                return -1;
            }

            int result = Integer.MAX_VALUE;
            int right = -1;
            for (int i = k; i < rightCount.length; i++) {
                if (rightCount[i][0] >= k && rightCount[i][1] >= k && rightCount[i][2] >= k) {
                    right = i;
                    break;
                }
            }
            for (int i = 0; i < leftCount.length; i++) {

                while (right >= 0 && leftCount[i][0] + rightCount[right][0] >= k && leftCount[i][1] + rightCount[right][1] >= k && leftCount[i][2] + rightCount[right][2] >= k) {
                    right--;
                }
                result = Math.min(result, i + right + 1);
            }
            return result;
        }
    }

}
package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1105,
        name = "Filling Bookcase Shelves",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming"}
)
public class _1105 {

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[][] dp = new int[books.length][shelfWidth + 1];
        return helper(dp, books, 0, shelfWidth, shelfWidth, 0);
    }

    private int helper(int[][] dp, int[][] books, int currBook, int shelfWidth, int shelfWidthLeft, int currShelfHeight) {
        if (currBook >= books.length) {
            return currShelfHeight;
        }
        int memo = dp[currBook][shelfWidthLeft];
        if (memo != 0) {
            return memo;
        }
        int height;
        int[] book = books[currBook];
        if (book[0] > shelfWidthLeft) {
            height = currShelfHeight + helper(dp, books, currBook + 1, shelfWidth, shelfWidth - book[0], book[1]);
        } else if (book[1] <= currShelfHeight) {
            height = helper(dp, books, currBook + 1, shelfWidth, shelfWidthLeft - book[0], Math.max(currShelfHeight, book[1]));
        } else {
            int thisShelfH = helper(dp, books, currBook + 1, shelfWidth, shelfWidthLeft - book[0], Math.max(currShelfHeight, book[1]));
            int newShelfH = currShelfHeight + helper(dp, books, currBook + 1, shelfWidth, shelfWidth - book[0], book[1]);
            height = Math.min(thisShelfH, newShelfH);
        }
        dp[currBook][shelfWidthLeft] = height;
        return height;
    }
}
package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3484,
        name = "Design Spreadsheet",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Design", "Matrix", "Biweekly Contest 152"}
)
public class _3484 {
    static class Spreadsheet {

        int[][] sheet;


        public Spreadsheet(int rows) {
            sheet = new int[26][rows];
        }

        public void setCell(String cell, int value) {
            sheet[cell.charAt(0) - 'A'][Integer.parseInt(cell.substring(1)) - 1] = value;
        }

        public void resetCell(String cell) {
            sheet[cell.charAt(0) - 'A'][Integer.parseInt(cell.substring(1)) - 1] = 0;
        }

        public int getValue(String formula) {
            String xS = formula.substring(1, formula.indexOf("+"));
            String yS = formula.substring(formula.indexOf("+") + 1);
            int x, y;
            if (Character.isDigit(xS.charAt(0))) {
                x = Integer.parseInt(xS);
            } else {
                x = sheet[xS.charAt(0) - 'A'][Integer.parseInt(xS.substring(1)) - 1];
            }
            if (Character.isDigit(yS.charAt(0))) {
                y = Integer.parseInt(yS);
            } else {
                y = sheet[yS.charAt(0) - 'A'][Integer.parseInt(yS.substring(1)) - 1];
            }
            return x + y;
        }
    }
}
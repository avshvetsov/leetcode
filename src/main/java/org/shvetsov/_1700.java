package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1700,
        name = "Number of Students Unable to Eat Lunch",
        level = Level.EASY,
        tags = {"Array", "Stack", "Queue", "Simulation"}
)
public class _1700 {

    public int countStudents(int[] students, int[] sandwiches) {
        int[] numberOfStudentsByPrefer = new int[2];
        for (int i = 0; i < students.length; i++) {
            numberOfStudentsByPrefer[students[i]]++;
        }

        int studentsLeft = students.length;
        for (int i = 0; i < sandwiches.length; i++) {
            if (numberOfStudentsByPrefer[sandwiches[i]] == 0) break;
            numberOfStudentsByPrefer[sandwiches[i]]--;
            studentsLeft--;
        }

        return studentsLeft;
    }
}
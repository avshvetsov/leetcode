package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@LeetCode(
        number = 874,
        name = "Walking Robot Simulation",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Simulation"}
)
public class _874 {

    private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private static final int dirLength = dirs.length;

    public int robotSim(int[] commands, int[][] obstacles) {
        int result = 0;
        int dir = 0;
        int[] pos = new int[]{0, 0};
        Map<Integer, Set<Integer>> obstaclesMap = new HashMap<>();
        for (int[] obstacle : obstacles) {
            obstaclesMap.computeIfAbsent(obstacle[0], k -> new HashSet<>()).add(obstacle[1]);
        }
        for (int command : commands) {
            if (command < 0) {
                dir = changeDir(dir, command);
            } else {
                moveRobot(pos, dir, command, obstaclesMap);
                result = Math.max(result, pos[0] * pos[0] + pos[1] * pos[1]);
            }
        }
        return result;
    }

    private void moveRobot(int[] pos, int dir, int units, Map<Integer, Set<Integer>> obstaclesMap) {
        for (int i = units; i > 0; i--) {
            int x = pos[0] + dirs[dir][0];
            int y = pos[1] + dirs[dir][1];
            if (obstaclesMap.containsKey(x) && obstaclesMap.get(x).contains(y)) {
                return;
            } else {
                pos[0] = x;
                pos[1] = y;
            }
        }
    }

    private int changeDir(int dir, int command) {
        return switch (command) {
            case -1 -> (dir + 1) % (dirLength);
            case -2 -> (dir + 3) % (dirLength);
            default -> 0;
        };
    }
}
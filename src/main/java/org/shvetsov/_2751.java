package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2751,
        name = "Robot Collisions",
        level = Level.HARD,
        tags = {"Array", "Stack", "Sorting", "Simulation"}
)
public class _2751 {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        //build Robots
        char[] dirs = directions.toCharArray();
        Robot[] robots = new Robot[positions.length];
        for (int i = 0; i < positions.length; i++) {
            robots[i] = new Robot(positions[i], healths[i], dirs[i], i);
        }
        Arrays.sort(robots, Comparator.comparingInt(value -> value.pos));
        //simulate
        Stack<Robot> stack = new Stack<>();
        for (Robot robot : robots) {
            robotCombat(stack, robot);
        }

        return stack.stream()
                .sorted(Comparator.comparingInt(r -> r.originalOrderNum))
                .map(robot -> robot.health)
                .toList();
    }

    private void robotCombat(Stack<Robot> stack, Robot robot) {
        if (!stack.isEmpty() && stack.peek().direction == 'R' && robot.direction == 'L') {
            Robot prev = stack.peek();
            if (prev.health == robot.health) {
                stack.pop();
            } else if (prev.health > robot.health) {
                prev.health--;
            } else if (prev.health < robot.health) {
                stack.pop();
                robot.health--;
                robotCombat(stack, robot);
            }
        } else {
            stack.push(robot);
        }
    }

    public static class Robot {
        int pos;
        int health;
        char direction;
        int originalOrderNum;

        public Robot(int pos, int health, char direction, int originalOrderNum) {
            this.pos = pos;
            this.health = health;
            this.direction = direction;
            this.originalOrderNum = originalOrderNum;
        }
    }

    public static class NoInnerClass {
        public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
            //build Robots
            char[] dirs = directions.toCharArray();
            int[][] robots = new int[positions.length][4];
            for (int i = 0; i < positions.length; i++) {
                robots[i] = new int[]{positions[i], healths[i], dirs[i], i};
            }
            Arrays.sort(robots, Comparator.comparingInt(value -> value[0]));
            //simulate
            Stack<int[]> stack = new Stack<>();
            for (int[] robot : robots) {
                robotCombat(stack, robot);
            }
            return stack.stream()
                    .sorted(Comparator.comparingInt(r -> r[3]))
                    .map(robot -> robot[1])
                    .toList();
        }

        private void robotCombat(Stack<int[]> stack, int[] robot) {
            if (!stack.isEmpty() && stack.peek()[2] == 'R' && robot[2] == 'L') {
                int[] prev = stack.peek();
                if (prev[1] == robot[1]) {
                    stack.pop();
                } else if (prev[1] > robot[1]) {
                    prev[1]--;
                } else if (prev[1] < robot[1]) {
                    stack.pop();
                    robot[1]--;
                    robotCombat(stack, robot);
                }
            } else {
                stack.push(robot);
            }
        }
    }
}
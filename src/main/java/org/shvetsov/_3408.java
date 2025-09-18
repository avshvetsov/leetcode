package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 3408,
        name = "Design Task Manager",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Design", "Heap (Priority Queue)", "Ordered Set", "Biweekly Contest 147"}
)
public class _3408 {
    static class TaskManager {

        private final Map<Integer, Task> taskMap =  new HashMap<>();
        private final TreeSet<Task> pq = new TreeSet<>(
                (o1, o2) -> o1.priority() != o2.priority() ? Integer.compare(o2.priority(), o1.priority()) : Integer.compare(o2.taskId(), o1.taskId())
        );

        public TaskManager(List<List<Integer>> tasks) {
            for (List<Integer> task : tasks) {
                add(task.get(0),  task.get(1), task.get(2));
            }
        }

        public void add(int userId, int taskId, int priority) {
            Task task = new Task(userId, taskId, priority);
            taskMap.put(taskId, task);
            pq.add(task);
        }

        public void edit(int taskId, int newPriority) {
            Task old = taskMap.remove(taskId);
            Task newTask = old.withPriority(newPriority);
            taskMap.put(taskId, newTask);
            pq.remove(old);
            pq.add(newTask);
        }

        public void rmv(int taskId) {
            Task old = taskMap.remove(taskId);
            pq.remove(old);
        }

        public int execTop() {
            if (!pq.isEmpty()) {
                Task executed = pq.removeFirst();
                taskMap.remove(executed.taskId());
                return executed.userId();
            } else
                return -1;
        }

        record Task(int userId, int taskId, int priority) {
            public Task withPriority(int newPriority) {
                return new Task(userId, taskId, newPriority);
            }
        }
    }
}
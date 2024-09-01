package task3;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public void createTask(String title, String description) {
        Task newTask = new Task(tasks.size() + 1, title, description);
        tasks.add(newTask);
        System.out.println(tasks.get(0));
        System.out.println("Task created successfully!");
    }
}

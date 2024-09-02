package task5;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList();

    public void createTask(String title, String description) {
        task3.Task newTask = new task3.Task(tasks.size() + 1, title, description);
        tasks.add(newTask);
        saveTasksToFile(tasks);
        System.out.println(tasks.get(0));
        System.out.println("Task created successfully!");
    }
    public void readTasks(){
        readTasksFromFile();

}

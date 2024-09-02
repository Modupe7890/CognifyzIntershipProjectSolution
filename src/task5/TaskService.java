package task5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    public void readTasks() {
        readTasksFromFile();
    }
    public void updateTask(int id, String newTitle, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                saveTasksToFile(tasks);
                System.out.println("Task updated Successfully");
                return;
            }
        }
        System.out.println("Task not found");
    }
    public void deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                saveTasksToFile(tasks);
                System.out.println("Task deleted successfully");
                return;
            }
        }
        System.out.println("Task not found");
    }
    public void saveTasksToFile(List<task3.Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/task3/task.txt"))) {
            for (task3.Task task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving tasks to file.");
            e.printStackTrace();
        }
    }
}

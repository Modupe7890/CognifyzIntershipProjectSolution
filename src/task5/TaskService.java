package task5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList();

    public void createTask(String title, String description) {
        task5.Task newTask = new task5.Task(tasks.size() + 1, title, description);
        tasks.add(newTask);
        saveTasksToFile(tasks);
        System.out.println(tasks.get(0));
        System.out.println("Task created successfully!");
    }
    public void readTasks() {
        readTasksFromFile();
    }
    public void updateTask(int id, String newTitle, String newDescription) {
        for (task5.Task task : tasks) {
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
        for (task5.Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                saveTasksToFile(tasks);
                System.out.println("Task deleted successfully");
                return;
            }
        }
        System.out.println("Task not found");
    }
    public void saveTasksToFile(List<task5.Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/task5/task.txt"))) {
            for (task5.Task task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving tasks to file.");
            e.printStackTrace();
        }
    }
    public void readTasksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/task5/task.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading tasks from file.");
            e.printStackTrace();
        }
    }
}

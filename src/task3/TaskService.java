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
    public void readTasks(){

        if(tasks.isEmpty()){
            System.out.println("No task is available");
        } else {
            for(Task task : tasks){
                System.out.println(task);
            }
        }
    }
    public void updateTask(int id, String newTitle, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                System.out.println("Task updated Successfully");
                return;
            }
        }
        System.out.println("Task not found");
    }
        public void deleteTask(int id){
            for(Task task : tasks){
                if(task.getId() == id){
                    tasks.remove(task);
                    System.out.println("Task deleted successfully");
                    return;
                }
            }
            System.out.println("Task not found");
        }
}

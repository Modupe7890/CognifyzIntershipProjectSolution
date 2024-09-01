package task3;

import java.util.Scanner;

public class TaskController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskService taskService = new TaskService();

        boolean running = true;
        while (running) {
            System.out.println("1. Create Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("To create a task input the following");
                    System.out.println("----------------------");
                    System.out.println("Input the title of task");
                    String title = input.next();
                    System.out.println("Input the title of description");
                    String description = input.next();
                    taskService.createTask(title, description);
                    break;
                case 2:
                    taskService.readTasks();
                    break;
                case 3:
                    System.out.print("Enter task ID to update: ");
                    int updateId = input.nextInt();
                    System.out.print("Enter new title: ");
                    String newTitle = input.next();
                    System.out.print("Enter new description: ");
                    String newDescription = input.next();
                    taskService.updateTask(updateId, newTitle, newDescription);
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = input.nextInt();
                    taskService.deleteTask(deleteId);
                    break;
            }

        }

    }
}
